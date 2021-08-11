package com.bjpowernode.boot05web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 徐梦凡
 * 2021/6/19
 */
@Controller
public class WebController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoothel(){
        return "springboot框架------";
    }
}
