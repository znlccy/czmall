package com.czmall.upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: UploadController
 * FileName：UploadController.java
 * Description：上传控制器
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-05 22:35		create
 */
@Controller
@RequestMapping(value = "/upload")
public class UploadController {

    @RequestMapping(value = "")
    public void upload() {
        System.out.println("上传微服务");
    }
}
