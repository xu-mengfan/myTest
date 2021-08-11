package com.bjpowernode.config;

import com.bjpowernode.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 徐梦凡
 * 2021/6/22
 *
 * WebMvcConfigurer提供了类似于springmvc配置文件的作用
 */
@Configuration
public class webConfig implements WebMvcConfigurer {
    //注册拦截器对象
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //定义拦截的地址
        String path [] = {"/user/**"};
        //定义不拦截的地址
        String excludePath [] = {"/user/login"};
        //参数是拦截器对象
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(path).excludePathPatterns(excludePath);
    }
}
