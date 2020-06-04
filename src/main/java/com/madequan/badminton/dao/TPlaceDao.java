package com.madequan.badminton.dao;

import com.madequan.badminton.entity.TPlace;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TPlace)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-03 22:54:47
 */
public interface TPlaceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TPlace queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TPlace> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tPlace 实例对象
     * @return 对象列表
     */
    List<TPlace> queryAll(TPlace tPlace);

    /**
     * 新增数据
     *
     * @param tPlace 实例对象
     * @return 影响行数
     */
    int insert(TPlace tPlace);

    /**
     * 修改数据
     *
     * @param tPlace 实例对象
     * @return 影响行数
     */
    int update(TPlace tPlace);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}