package com.madequan.badminton.service;

import com.madequan.badminton.entity.TReserveMessage;
import java.util.List;

/**
 * (TReserveMessage)表服务接口
 *
 * @author makejava
 * @since 2020-06-06 18:49:13
 */
public interface TReserveMessageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TReserveMessage queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TReserveMessage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tReserveMessage 实例对象
     * @return 实例对象
     */
    TReserveMessage insert(TReserveMessage tReserveMessage);

    /**
     * 修改数据
     *
     * @param tReserveMessage 实例对象
     * @return 实例对象
     */
    TReserveMessage update(TReserveMessage tReserveMessage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}