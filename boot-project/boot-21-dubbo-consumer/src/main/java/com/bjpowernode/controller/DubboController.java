package com.bjpowernode.controller;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.MyStudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 徐梦凡
 * 2021/6/24
 * interfaceClass = MyStudentService.class可以省略
 */
@RestController
public class DubboController {

    //注入提供者
    @DubboReference(version = "1.0")
    private MyStudentService studentService;

    @GetMapping("/student/query")
    public Student queryStudentById(Integer id){
        Student student = studentService.queryStudentById(id);
        return student;

    }
}
