package com.bjpowernode.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 徐梦凡
 * 2021/6/19
 */
//让spring创建school对象
@Component
//相当于配置文件中的key:
// school：name....
@ConfigurationProperties(prefix = "school")
public class School {
    private String name;
    private String address;
    private String siter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSiter() {
        return siter;
    }

    public void setSiter(String siter) {
        this.siter = siter;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", siter='" + siter + '\'' +
                '}';
    }
}
