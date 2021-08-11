package com.bjpowernode.boot21dubboconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class Boot21DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot21DubboConsumerApplication.class, args);
    }

}
