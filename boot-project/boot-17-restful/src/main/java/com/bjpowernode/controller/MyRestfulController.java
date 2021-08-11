package com.bjpowernode.controller;

import com.bjpowernode.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 徐梦凡
 * 2021/6/23
 * @RestController:表示当前类中 所有方法的返回值都加上了@responseBody（json类型）返回值都是数据
 */
@RestController
public class MyRestfulController {
    //查询学生信息
    //资源是单个  使用单数，例如：student
    @GetMapping("/student/{studentId}")
    public Student queryStudent(@PathVariable(value = "studentId") Integer id){
        System.out.println("接收的studentId=" + id);
        return new Student("lisi",20);
    }

//    @GetMapping("/student/{className}")
    //改变请求方式 或者 路径改变
//    public Student queryStudent(@PathVariable(value = "className") String className){
//        System.out.println("接收的className=" + className);
//        return new Student("lisi",20);
//    }

    //查询一个班的学生，资源是多个，使用复数，例如 students
    @GetMapping("/students/class/{className}")
    public List<Student> queryStudentByClass(@PathVariable(value = "className") String cname){
        System.out.println("class=" + cname);
        return Arrays.asList(new Student("lisi",20),new Student("zs",25));
    }

    //查询某个班级中的某个学生，资源是多个，使用复数，例如 students
    //路径名和形参名一致  则可以省略
    //@GetMapping("/student/class/{id}/{className}")
    @GetMapping("/student/{id}/class/{className}")
    public List<Student> queryStudentInClass(@PathVariable String className,@PathVariable Integer id){
        System.out.println("class=" + className + ",id=" + id);
        return Arrays.asList(new Student("lisi",20),new Student("zs",25));
    }

    //创建资源
    @PostMapping("/student/{name}/{age}")
    public Student createStudent(@PathVariable String name,
                                 @PathVariable Integer age){
        return new Student(name,age);
    }

    //修改资源
    @PutMapping("/student/{id}/{newName}")
    public Student updateStudent(@PathVariable Integer id,
                                 @PathVariable String newName){
        System.out.println("修改学生" + id);
        return new Student(newName,22);
    }

    //删除资源
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return "删除了学生：" + id;
    }
}
