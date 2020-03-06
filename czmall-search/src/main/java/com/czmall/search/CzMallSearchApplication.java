package com.czmall.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: CzMallSearchApplication
 * FileName：CzMallSearchApplication.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-01 19:40		create
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CzMallSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(CzMallSearchApplication.class);
    }
}
