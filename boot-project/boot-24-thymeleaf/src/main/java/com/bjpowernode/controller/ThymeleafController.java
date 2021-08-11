package com.bjpowernode.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 徐梦凡
 * 2021/6/25
 */
@Controller
public class ThymeleafController {

    @GetMapping("/quick")
    public String quick(Model model, HttpServletRequest request){
        model.addAttribute("m", "model中添加数据");
        request.setAttribute("r", "request作用域中的数据");
        return "quick";


    }
}
