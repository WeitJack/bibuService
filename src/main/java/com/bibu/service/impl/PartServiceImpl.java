package com.bibu.service.impl;

import com.bibu.dao.HospitalDao;
import com.bibu.entity.Part;
import com.bibu.dao.PartDao;
import com.bibu.service.PartService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

import javax.annotation.Resource;

/**
 * 网站栏目表(Part)表服务实现类
 *
 * @author WeitJack
 * @since 2022-01-15 12:38:22
 */
@Service("partService")
public class PartServiceImpl implements PartService {
    @Resource
    private PartDao partDao;

    @Resource
    private HospitalDao hospitalDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Part queryById(Integer id) {
        return this.partDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param part 筛选条件
     * @return 查询结果
     */
    @Override
    public PageInfo<Part> queryByPage(Part part) {
        PageHelper.startPage(part.getPageNum(), part.getPageSize(), part.getSortField());
        List<Part> models = this.partDao.queryAllByLimit(part);
        return new PageInfo<>(models);
    }

    /**
     * 获取所有part
     *
     * @param part 筛选条件
     * @return 查询结果
     */
    @Override
    public List<Part> getPartList(Part part) {
        return this.partDao.queryAllByLimit(part);
    }

    /**
     * 新增数据
     *
     * @param part 实例对象
     * @return 实例对象
     */
    @Override
    public Part insert(Part part) {
        this.partDao.insert(part);
        return part;
    }

    /**
     * 修改数据
     *
     * @param part 实例对象
     * @return 实例对象
     */
    @Override
    public Part update(Part part) {
        this.partDao.update(part);
        return this.queryById(part.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        int hospitalFlag = this.hospitalDao.updateByPartId(id);
        int partFlag = this.partDao.deleteById(id);
        return hospitalFlag > 0 && partFlag > 0;
    }
}
