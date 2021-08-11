package com.bjpowernode;

import com.bjpowernode.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.java2d.pipe.SpanIterator;

@SpringBootApplication
public class Boot09CommandlineApplication implements CommandLineRunner {

    @Autowired
    private Student student;

    public static void main(String[] args) {

        System.out.println("1.springboot项目启动，准备 要创建容器了......");
        SpringApplication.run(Boot09CommandlineApplication.class, args);
        System.out.println("3.run方法执行完毕");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("2.用来执行connmanlinerunner方法" + student.getName());

    }
}
