package com.bjpowernode.service.impl;

import com.bjpowernode.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 徐梦凡
 * 2021/6/22
 */
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Override
    public void add(String name, Integer age) {
        System.out.println("name=" + name + "age=" + age);
    }
}
