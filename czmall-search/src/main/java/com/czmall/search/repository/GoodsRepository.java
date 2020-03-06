package com.czmall.search.repository;

import com.czmall.search.model.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * ClassName: GoodsRepository
 * FileName：GoodsRepository.java
 * Description：商品查询Dao层
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-02 15:23		create
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {
}
