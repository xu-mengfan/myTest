package com.bjpowernode.controller;

import com.bjpowernode.model.School;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.concurrent.ScheduledExecutorService;

/**
 * 徐梦凡
 * 2021/6/19
 */
@Controller
public class BootController {

    @Value("${school.name}")
    private String name;
    @Value("${school.address}")
    private String adderss;
    @Value("${school.site}")
    private String site;

    @Value("${server.port}")
    private String port;

    @Value("${server.servlet.context-path}")
    private String path;

    //注入容器创建好的对象
    @Resource   //autowired也可以
    public School school;

    @RequestMapping("/get")
    @ResponseBody
    public String getInfo(){

        return "自定义的配置：" + name + "  " + adderss + "  " + site + "  " + port + "  " + path + "  ";
    }

    @RequestMapping("/get2")
    @ResponseBody
    public String getInfo2(){

        return "学习开发：" + school.toString();
    }
}
