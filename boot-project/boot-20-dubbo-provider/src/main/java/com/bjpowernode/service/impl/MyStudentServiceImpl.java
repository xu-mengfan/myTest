package com.bjpowernode.service.impl;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.MyStudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * 徐梦凡
 * 2021/6/24
 * interfaceClass = MyStudentService.class可以省略不写
 */
@DubboService(version = "1.0")
public class MyStudentServiceImpl implements MyStudentService {

    @Override
    public Student queryStudentById(Integer id) {
        System.out.println("提供者方法执行，studentId=" + id);

        Student student =new Student();
        student.setName("lisi");
        student.setAge(20);
        return student;
    }
}
