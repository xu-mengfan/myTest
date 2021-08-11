package com.bjpowernode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//可选，启动事务管理器
@EnableTransactionManagement
//@MapperScan:来自于mybatis框架，扫描所有的dao接口，让mybatis创建他们的代理对象
@MapperScan(basePackages = {"com.bjpowernode.dao"})
@SpringBootApplication
public class Boot16Mybatis1Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot16Mybatis1Application.class, args);
    }

}
