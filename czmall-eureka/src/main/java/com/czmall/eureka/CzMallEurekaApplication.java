package com.czmall.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName: CzMallEurekaApplication
 * FileName：CzMallEurekaApplication.java
 * Description：注册中心
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-02-27 22:48		create
 */
@SpringBootApplication
@EnableEurekaServer
public class CzMallEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CzMallEurekaApplication.class);
    }
}
