package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentMapper;
import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Service;

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
}
