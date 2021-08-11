package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 徐梦凡
 * 2021/6/22
 */
@Controller
public class MyController {

    @RequestMapping("/user/account")
    @ResponseBody
    public String queryAccount(){
        return "查询账号信息，需要登陆";
    }

    @RequestMapping("/user/add")
    @ResponseBody
    public String add(){
        return "增加账号信息，需要登陆";
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public String userLogin(){
        return "执行了登录功能======";
    }
}
