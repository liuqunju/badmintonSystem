package com.madequan.badminton.dao;

import com.madequan.badminton.entity.TReserveMessage;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TReserveMessage)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-06 18:49:12
 */
public interface TReserveMessageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TReserveMessage queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TReserveMessage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tReserveMessage 实例对象
     * @return 对象列表
     */
    List<TReserveMessage> queryAll(TReserveMessage tReserveMessage);

    /**
     * 新增数据
     *
     * @param tReserveMessage 实例对象
     * @return 影响行数
     */
    int insert(TReserveMessage tReserveMessage);

    /**
     * 修改数据
     *
     * @param tReserveMessage 实例对象
     * @return 影响行数
     */
    int update(TReserveMessage tReserveMessage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}