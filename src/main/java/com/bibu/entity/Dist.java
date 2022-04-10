package com.bibu.entity;

import com.bibu.bean.PageBean;
import java.io.Serializable;

/**
 * 数据字典表(Dist)实体类
 *
 * @author WeitJack
 * @since 2022-04-10 21:36:55
 */
public class Dist extends PageBean implements Serializable {
    private static final long serialVersionUID = 826664330805174488L;
    /**
     * id
     */
    private Integer id;
    /**
     * 键值
     */
    private String key;
    /**
     * 值
     */
    private String value;
    /**
     * 类型(String/Picture)
     */
    private String type;
    /**
     * 描述
     */
    private String comments;
    /**
     * 状态
     */
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}

