package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentMapper;
import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 徐梦凡
 * 2021/6/22
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        Student student = studentMapper.selectStudentById(id);
        System.out.println("学生对象=" + student);
        return student;
    }

    //给addStudent()方法添加事务
    //回滚事务：当方法抛出RunTimeException/Error
    //提交事务：方法正常执行；方法抛出受查异常提交事务
    @Transactional
    @Override
    public int addStudent(Student student) {
        int rows = studentMapper.insertStudent(student);
        //抛出一个运行时异常
        //int a = 10 / 0;
        return rows;
    }
}
