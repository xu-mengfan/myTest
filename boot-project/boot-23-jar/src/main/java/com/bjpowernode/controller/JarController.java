package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 徐梦凡
 * 2021/6/24
 */
@Controller
public class JarController {

    @GetMapping("/index")
    public String index(Model model){
        System.out.println("执行了jsp应用，index法法");
        model.addAttribute("data", "jsp,打包为jar") ;
        return "index";
    }
}
