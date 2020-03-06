package com.czmall.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: CzMallEmailApplicaion
 * FileName：CzMallEmailApplicaion.java
 * Description：邮件微服务
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-01 19:50		create
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CzMallEmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(CzMallEmailApplication.class);
    }
}
