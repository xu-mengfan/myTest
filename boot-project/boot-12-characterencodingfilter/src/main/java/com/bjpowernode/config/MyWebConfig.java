package com.bjpowernode.config;

import com.bjpowernode.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * 徐梦凡
 * 2021/6/22
 */
@Configuration
public class MyWebConfig {

    @Bean
    public ServletRegistrationBean ServletRegistration(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(),"/myservlet");
        return servletRegistrationBean;
    }
//
//    //使用框架中的characterEncodingFilter设置request和response的字符集
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean(){
//        FilterRegistrationBean frb = new FilterRegistrationBean();
//        CharacterEncodingFilter cef = new CharacterEncodingFilter();
//        cef.setEncoding("utf-8");
//        cef.setForceEncoding(true);
//        frb.setFilter(cef);
//        //过滤所有的请求
//        frb.addUrlPatterns("/*");
//        return frb;
//    }
}
