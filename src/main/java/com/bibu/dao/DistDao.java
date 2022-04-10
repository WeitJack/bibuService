package com.bibu.dao;

import com.bibu.entity.Dist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 数据字典表(Dist)表数据库访问层
 *
 * @author WeitJack
 * @since 2022-04-10 21:36:54
 */
@Mapper
public interface DistDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dist queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param dist 查询条件
     * @return 对象列表
     */
    List<Dist> queryAllByLimit(Dist dist);

    /**
     * 统计总行数
     *
     * @param dist 查询条件
     * @return 总行数
     */
    long count(Dist dist);

    /**
     * 新增数据
     *
     * @param dist 实例对象
     * @return 影响行数
     */
    int insert(Dist dist);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Dist> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Dist> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Dist> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Dist> entities);

    /**
     * 修改数据
     *
     * @param dist 实例对象
     * @return 影响行数
     */
    int update(Dist dist);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

