package com.bibu.service.impl;

import com.bibu.entity.Dist;
import com.bibu.dao.DistDao;
import com.bibu.service.DistService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

import javax.annotation.Resource;

/**
 * 数据字典表(Dist)表服务实现类
 *
 * @author WeitJack
 * @since 2022-04-10 21:36:55
 */
@Service("distService")
public class DistServiceImpl implements DistService {
    @Resource
    private DistDao distDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Dist queryById(Integer id) {
        return this.distDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param dist 筛选条件
     * @return 查询结果
     */
    @Override
    public PageInfo<Dist> queryByPage(Dist dist) {
        PageHelper.startPage(dist.getPageNum(),dist.getPageSize(), dist.getSortField());
        List<Dist> models = this.distDao.queryAllByLimit(dist);
        PageInfo<Dist> pageInfo = new PageInfo<>(models);
        return pageInfo;
    }

    /**
     * 新增数据
     *
     * @param dist 实例对象
     * @return 实例对象
     */
    @Override
    public Dist insert(Dist dist) {
        this.distDao.insert(dist);
        return dist;
    }

    /**
     * 修改数据
     *
     * @param dist 实例对象
     * @return 实例对象
     */
    @Override
    public Dist update(Dist dist) {
        this.distDao.update(dist);
        return this.queryById(dist.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.distDao.deleteById(id) > 0;
    }
}
