package com.bjpowernode.model;

import org.springframework.stereotype.Component;

/**
 * 徐梦凡
 * 2021/6/22
 */
@Component("myStudent")
public class Student {
    private String name = "lisi";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
