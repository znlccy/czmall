package com.czmall.common.response;

/**
 * ClassName: CommonResult
 * FileName：CommonResult.java
 * Description：公用返回结果类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-01 16:01		create
 */
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

}
