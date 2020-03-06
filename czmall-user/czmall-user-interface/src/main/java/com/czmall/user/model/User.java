package com.czmall.user.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * ClassName: User
 * FileName：User.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-01 20:12		create
 */
@Data
@ToString
public class User implements Serializable {

    /**
     * 对象序列化
     */
    private static final long serialVersionUID = 7705449872630985888L;

    /**
     * 用户主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别
     */
    private Character gender;

    /**
     * 手机
     */
    private String mobile;


}
