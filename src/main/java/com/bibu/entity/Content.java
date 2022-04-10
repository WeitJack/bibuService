package com.bibu.entity;

import java.util.Date;

import com.bibu.bean.PageBean;

import java.io.Serializable;

/**
 * 内容表(Content)实体类
 *
 * @author WeitJack
 * @since 2022-02-21 22:09:09
 */
public class Content extends PageBean implements Serializable {
    private static final long serialVersionUID = 323953463343095030L;
    /**
     * id
     */
    private Integer id;
    /**
     * 标签
     */
    private String label;
    /**
     * 标题
     */
    private String title;
    /**
     * 栏目id
     */
    private Integer partId;
    /**
     * 是否热点
     */
    private Integer isHot;
    /**
     * 文章简介
     */
    private String desc;
    /**
     * seo标题
     */
    private String seoTitle;
    /**
     * seo关键字
     */
    private String seoKeyword;
    /**
     * seo描述
     */
    private String seoDesc;
    /**
     * 缩略图地址
     */
    private String thumbnail;
    /**
     * 自定义链接
     */
    private String link;
    /**
     * 文章来源
     */
    private String source;
    /**
     * 文章作者
     */
    private String author;
    /**
     * 转运类型(1:市内转运、2:省内转运、3:跨省转运)
     */
    private Integer transportType;
    /**
     * 推荐位id
     */
    private Integer recommendPlateId;
    /**
     * pc端文章内容
     */
    private String pcContent;
    /**
     * 移动端文章内容
     */
    private String mobileContent;
    /**
     * 浏览数
     */
    private Integer viewCount;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 栏目名称
     */
    private String partName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getSeoKeyword() {
        return seoKeyword;
    }

    public void setSeoKeyword(String seoKeyword) {
        this.seoKeyword = seoKeyword;
    }

    public String getSeoDesc() {
        return seoDesc;
    }

    public void setSeoDesc(String seoDesc) {
        this.seoDesc = seoDesc;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getTransportType() {
        return transportType;
    }

    public void setTransportType(Integer transportType) {
        this.transportType = transportType;
    }

    public Integer getRecommendPlateId() {
        return recommendPlateId;
    }

    public void setRecommendPlateId(Integer recommendPlateId) {
        this.recommendPlateId = recommendPlateId;
    }

    public String getPcContent() {
        return pcContent;
    }

    public void setPcContent(String pcContent) {
        this.pcContent = pcContent;
    }

    public String getMobileContent() {
        return mobileContent;
    }

    public void setMobileContent(String mobileContent) {
        this.mobileContent = mobileContent;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }
}

