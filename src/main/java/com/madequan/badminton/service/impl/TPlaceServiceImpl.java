package com.madequan.badminton.service.impl;

import com.madequan.badminton.entity.Pager;
import com.madequan.badminton.entity.TPlace;
import com.madequan.badminton.dao.TPlaceDao;
import com.madequan.badminton.placeenum.PlaceEnum;
import com.madequan.badminton.service.TPlaceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TPlace)表服务实现类
 *
 * @author makejava
 * @since 2020-06-03 22:54:47
 */
@Service("tPlaceService")
public class TPlaceServiceImpl implements TPlaceService {
    @Resource
    private TPlaceDao tPlaceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TPlace queryById(String id) {
        return this.tPlaceDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public Pager queryAllByLimit(int offset, int limit, TPlace tPlace) {
        List<TPlace> tPlaces = tPlaceDao.queryAll(tPlace);
        int count = tPlaceDao.selectTplaceCount();
        tPlaces.forEach(t -> {
            if (PlaceEnum.free.getCode().equals(t.getPlaceStatus())) {
                t.setPlaceStatus(PlaceEnum.free.getDesc());
            } else if (PlaceEnum.booked.getCode().equals(t.getPlaceStatus())) {
                t.setPlaceStatus(PlaceEnum.booked.getDesc());
            } else {
                t.setPlaceStatus(PlaceEnum.inuse.getDesc());
            }
        });
        Pager<TPlace> pager = new Pager<>(tPlaces,offset,limit);
        return pager;
    }
    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<TPlace> findAll() {
        return this.tPlaceDao.findAll();
    }

    /**
     * 新增数据
     *
     * @param tPlace 实例对象
     * @return 实例对象
     */
    @Override
    public TPlace insert(TPlace tPlace) {
        this.tPlaceDao.insert(tPlace);
        return tPlace;
    }

    /**
     * 修改数据
     *
     * @param tPlace 实例对象
     * @return 实例对象
     */
    @Override
    public TPlace update(TPlace tPlace) {
        this.tPlaceDao.update(tPlace);
        return this.queryById(tPlace.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tPlaceDao.deleteById(id) > 0;
    }
}