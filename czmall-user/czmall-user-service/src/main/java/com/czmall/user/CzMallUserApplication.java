package com.czmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: CzMallUserApplication
 * FileName：CzMallUserApplication.java
 * Description：用户微服务
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-01 20:22		create
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CzMallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CzMallUserApplication.class);
    }
}
