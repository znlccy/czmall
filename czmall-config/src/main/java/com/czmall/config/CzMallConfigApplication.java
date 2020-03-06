package com.czmall.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: CzMallConfigApplication
 * FileName：CzMallConfigApplication.java
 * Description：配置中心
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-01 15:24		create
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CzMallConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CzMallConfigApplication.class);
    }
}
