package com.bjpowernode.config;

import com.bjpowernode.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 徐梦凡
 * 2021/6/19
 * @Configuration:表示当前类作为xml配置文件使用
 */
@Configuration
public class SpringConfig {

    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        return student;
    }

    @Bean(name = "MyStudent")
    public Student createStudent1(){
        Student student = new Student();
        student.setName("lisi");
        student.setAge(20);
        return student;
    }
}
