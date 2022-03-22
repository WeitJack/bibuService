package com.bibu.dao;

import com.bibu.entity.Hospital;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 医院表(Hospital)表数据库访问层
 *
 * @author WeitJack
 * @since 2022-01-24 21:34:22
 */
@Mapper
public interface HospitalDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Hospital queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param hospital 查询条件
     * @return 对象列表
     */
    List<Hospital> queryAllByLimit(Hospital hospital);

    /**
     * 统计总行数
     *
     * @param hospital 查询条件
     * @return 总行数
     */
    long count(Hospital hospital);

    /**
     * 新增数据
     *
     * @param hospital 实例对象
     * @return 影响行数
     */
    int insert(Hospital hospital);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Hospital> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Hospital> entities);


    /**
     * 修改数据
     *
     * @param hospital 实例对象
     * @return 影响行数
     */
    int update(Hospital hospital);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 通过栏目Id修改数据
     *
     * @param partId partId
     * @return 影响行数
     */
    int updateByPartId(Integer partId);

}

