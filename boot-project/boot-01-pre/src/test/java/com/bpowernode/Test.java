package com.bpowernode;

import com.bjpowernode.config.SpringConfig;
import com.bjpowernode.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 徐梦凡
 * 2021/6/19
 */
public class Test {
    @org.junit.Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("benas.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println("student=" + student);
    }

    @org.junit.Test
    public void test02(){
        ApplicationContext ca = new AnnotationConfigApplicationContext(SpringConfig.class);
        //默认的对象名称是 方法名
        Student student = (Student) ca.getBean("createStudent");
        System.out.println("student=" + student);
    }

    @org.junit.Test
    public void test03(){
        ApplicationContext ca = new AnnotationConfigApplicationContext(SpringConfig.class);
        //使用指定的对象的名称
        Student student = (Student) ca.getBean("MyStudent");
        System.out.println("student=" + student);
    }
}
