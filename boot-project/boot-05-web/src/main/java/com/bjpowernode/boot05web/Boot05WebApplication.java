package com.bjpowernode.boot05web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.security.PublicKey;
import java.util.Date;

/***
 * 有这个@SpringBootApplication注解的类是启动类
 * SpringBootApplication具有@configration功能，具有xml配置文件的作用
 */
@SpringBootApplication
public class Boot05WebApplication {

    @Bean
    public Date myDate(){
        Date date = new Date();
        return date;
    }

    public static void main(String[] args) {

        SpringApplication.run(Boot05WebApplication.class, args);
    }

}
