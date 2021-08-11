package com.bjpowernode;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@EnableDubbo表示启动dubbo
@EnableDubbo
@SpringBootApplication
public class Boot20DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot20DubboProviderApplication.class, args);
    }

}
