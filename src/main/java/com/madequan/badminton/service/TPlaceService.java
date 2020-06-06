package com.madequan.badminton.service;

import com.madequan.badminton.entity.Pager;
import com.madequan.badminton.entity.TPlace;
import java.util.List;

/**
 * (TPlace)表服务接口
 *
 * @author makejava
 * @since 2020-06-03 22:54:47
 */
public interface TPlaceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TPlace queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    Pager queryAllByLimit(int offset, int limit, TPlace tPlace);
    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<TPlace> findAll();

    /**
     * 新增数据
     *
     * @param tPlace 实例对象
     * @return 实例对象
     */
    TPlace insert(TPlace tPlace);

    /**
     * 修改数据
     *
     * @param tPlace 实例对象
     * @return 实例对象
     */
    TPlace update(TPlace tPlace);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}