package com.bjpowernode.config;

import com.bjpowernode.web.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 徐梦凡
 * 2021/6/22
 */
@Configuration
public class MyWebConfig {

    @Bean
     public FilterRegistrationBean filterRegistrationBean(){
         FilterRegistrationBean frb = new FilterRegistrationBean();
         //过滤器对象
         frb.setFilter(new MyFilter());
         //过滤器要过滤的地址
         frb.addUrlPatterns("/user/*");
         return frb;
     }
}
