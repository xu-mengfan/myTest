package com.bjpowernode.controller;


import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 徐梦凡
 * 2021/6/22
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/query")
    @ResponseBody
    public Student query(Integer id){
        Student student = studentService.queryStudentById(id);
        return student;
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addStudent(Student student){
        int rows = studentService.addStudent(student);
        return (rows > 0 ? "添加学生成功" : "添加失败");
    }

}
