package com.czmall.goods.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * ClassName: Brand
 * FileName：Brand.java
 * Description：品牌实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-01 18:21		create
 */
@Data
@ToString
public class Brand implements Serializable {

    /**
     * 序列化对象
     */
    private static final long serialVersionUID = -8217086056178932351L;

    /**
     * 品牌主键
     */
    private Long id;

    /**
     * 品牌名称
     */
    private String name;

    /**
     * 品牌图片
     */
    private String image;

    /**
     * 品牌描述
     */
    private Character letter;
}
