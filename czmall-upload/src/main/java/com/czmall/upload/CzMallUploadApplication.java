package com.czmall.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: CzMallUploadApplication
 * FileName：CzMallUploadApplication.java
 * Description：上传微服务
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-01 18:55		create
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CzMallUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(CzMallUploadApplication.class);
    }
}
