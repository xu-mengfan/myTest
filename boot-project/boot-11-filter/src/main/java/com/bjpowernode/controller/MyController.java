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
    public String userAccount(){
        return "查询用户user/account";
    }

    @RequestMapping("/query")
    @ResponseBody
    public String query(){
        return "查询地址/query";
    }
}
