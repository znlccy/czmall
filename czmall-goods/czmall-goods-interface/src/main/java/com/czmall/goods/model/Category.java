package com.czmall.goods.model;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * ClassName: Category
 * FileName：Category.java
 * Description：分类实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-01 18:24		create
 */
@Data
@ToString
@Table(name = "TB_CATEGORY")
public class Category implements Serializable {

    /**
     * 对象序列化
     */
    private static final long serialVersionUID = 4667580527968646887L;

    /**
     * 分类主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 父节点主键
     */
    private Long parentId;

    /**
     * 是否是父节点
     */
    private Boolean isParent;

    /**
     * 分类排序
     */
    private Integer sort;
}
