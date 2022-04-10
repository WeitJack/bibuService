package com.bibu.service;

import com.bibu.entity.Dist;
import com.github.pagehelper.PageInfo;

/**
 * 数据字典表(Dist)表服务接口
 *
 * @author WeitJack
 * @since 2022-04-10 21:36:55
 */
public interface DistService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dist queryById(Integer id);

    /**
     * 分页查询
     *
     * @param dist 筛选条件
     * @return 查询结果
     */
    PageInfo<Dist> queryByPage(Dist dist);

    /**
     * 新增数据
     *
     * @param dist 实例对象
     * @return 实例对象
     */
    Dist insert(Dist dist);

    /**
     * 修改数据
     *
     * @param dist 实例对象
     * @return 实例对象
     */
    Dist update(Dist dist);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
