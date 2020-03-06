package com.czmall.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: CzMallGoodsApplication
 * FileName：CzMallGoodsApplication.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-01 16:50		create
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.czmall.goods.mapper")
public class CzMallGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CzMallGoodsApplication.class);
    }
}
