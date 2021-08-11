package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * 徐梦凡
 * 2021/6/24
 */
@Controller
public class JspController {

    @GetMapping("/index")
    public String toMain(Model model) {
        System.out.println("执行了JspController中的toMain方法：" + new Date());
        model.addAttribute("data", "springBoot打包为war");
        return "main";
    }

}
