package com.bibu.service.impl;

import com.bibu.entity.Content;
import com.bibu.dao.ContentDao;
import com.bibu.service.ContentService;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

/**
 * 内容表(Content)表服务实现类
 *
 * @author WeitJack
 * @since 2022-02-21 22:09:10
 */
@Service("contentService")
public class ContentServiceImpl implements ContentService {
    @Resource
    private ContentDao contentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Content queryById(Integer id) {
        return this.contentDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param content 筛选条件
     * @return 查询结果
     */
    @Override
    public PageInfo<Content> queryByPage(Content content) {
        PageHelper.startPage(content.getPageNum(), content.getPageSize(), content.getSortField());
        List<Content> models = this.contentDao.queryAllByLimit(content);
        PageInfo<Content> pageInfo = new PageInfo<>(models);
        return pageInfo;
    }

    /**
     * 新增数据
     *
     * @param content 实例对象
     * @return 实例对象
     */
    @Override
    public Content insert(Content content) {
        content.setCreateTime(new Date());
        this.contentDao.insert(content);
        return content;
    }

    /**
     * 修改数据
     *
     * @param content 实例对象
     * @return 实例对象
     */
    @Override
    public Content update(Content content) {
        content.setUpdateTime(new Date());
        this.contentDao.update(content);
        return this.queryById(content.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.contentDao.deleteById(id) > 0;
    }
}
