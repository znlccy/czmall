package com.czmall.goods.service.impl;

import com.czmall.goods.mapper.BrandMapper;
import com.czmall.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: BrandServiceImpl
 * FileName：BrandServiceImpl.java
 * Description：品牌服务接口
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-06 15:02		create
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

}
