package com.czmall.search.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * ClassName: Goods
 * FileName：Goods.java
 * Description：商品实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-01 21:27		create
 */
@Document(indexName = "goods", type = "docs", shards = 0, replicas = 1)
@Data
public class Goods {

    @Id
    private Long id;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String all;

    @Field(type = FieldType.Keyword, index = false)
    private String subTitle;

    private Long brandId;

    private Long cid1;

    private Long cid2;

    private Long cid3;

    private Date createTime;

}
