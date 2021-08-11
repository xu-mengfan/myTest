package com.bjpowernode.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 徐梦凡
 * 2021/6/19
 */
@Controller
public class BootController {

    @Value("${server.port}")
    private String port;

    @Value("${server.servlet.context-path}")
    private String path;

    @RequestMapping("/env")
    @ResponseBody
    public String env(){
        return "使用多环境配置之文件";
    }

}
