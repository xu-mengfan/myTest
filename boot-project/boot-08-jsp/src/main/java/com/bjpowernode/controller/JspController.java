package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 徐梦凡
 * 2021/6/22
 */
@Controller
public class JspController {

    @RequestMapping("/jsp")

    public String toJsp(Model model){
        model.addAttribute("data", "在spring boot中使用jsp");
        return "index";
    }
}
