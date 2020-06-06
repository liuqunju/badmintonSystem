package com.madequan.badminton.service.impl;

import com.madequan.badminton.entity.TReserveMessage;
import com.madequan.badminton.dao.TReserveMessageDao;
import com.madequan.badminton.service.TReserveMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TReserveMessage)表服务实现类
 *
 * @author makejava
 * @since 2020-06-06 18:49:13
 */
@Service("tReserveMessageService")
public class TReserveMessageServiceImpl implements TReserveMessageService {
    @Resource
    private TReserveMessageDao tReserveMessageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TReserveMessage queryById(String id) {
        return this.tReserveMessageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TReserveMessage> queryAllByLimit(int offset, int limit) {
        return this.tReserveMessageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tReserveMessage 实例对象
     * @return 实例对象
     */
    @Override
    public TReserveMessage insert(TReserveMessage tReserveMessage) {
        this.tReserveMessageDao.insert(tReserveMessage);
        return tReserveMessage;
    }

    /**
     * 修改数据
     *
     * @param tReserveMessage 实例对象
     * @return 实例对象
     */
    @Override
    public TReserveMessage update(TReserveMessage tReserveMessage) {
        this.tReserveMessageDao.update(tReserveMessage);
        return this.queryById(tReserveMessage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tReserveMessageDao.deleteById(id) > 0;
    }
}