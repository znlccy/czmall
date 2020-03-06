package com.czmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * ClassName: CrosConfiguration
 * FileName：CrosConfiguration.java
 * Description：跨域配置类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-03-05 21:24		create
 */
@Configuration
public class CzMallCrosConfiguration {

    @Bean
    public CorsFilter crosFilter() {

        //初始化Cors配置对象
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //允许跨域的域名，如果携带cookie，不能写*， *代表所有域名都可以跨域访问
        corsConfiguration.addAllowedOrigin("http://manager.czmall.com");
        //是否允许携带cookie
        corsConfiguration.setAllowCredentials(true);
        //*代表所有的请求方法
        corsConfiguration.addAllowedMethod("*");
        //*允许携带任何头信息
        corsConfiguration.addAllowedHeader("*");


        //初始化cros配置源对象
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**", corsConfiguration);
        //返回crosFilter实例，参数: cros配置源对象
        return new CorsFilter(configurationSource);
    }
}
