package com.czmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ClassName: CzMallGatewayApplication
 * FileName：CzMallGatewayApplication.java
 * Description：网关
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-02-27 22:59		create
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class CzMallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CzMallGatewayApplication.class);
    }
}
