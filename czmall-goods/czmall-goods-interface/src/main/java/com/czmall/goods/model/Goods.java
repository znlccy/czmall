package com.czmall.goods.model;

import lombok.Data;

/**
 * ClassName: Goods
 * FileName：Goods.java
 * Description：商品微服务
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-01 16:49		create
 */
@Data
public class Goods {

    /**
     * 商品主键
     */
    private Long id;

    /**
     * 商品名称
     */
    private String name;



}
