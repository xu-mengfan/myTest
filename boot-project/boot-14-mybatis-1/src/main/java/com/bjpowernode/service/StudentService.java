package com.bjpowernode.service;

import com.bjpowernode.model.Student;

/**
 * 徐梦凡
 * 2021/6/22
 */
public interface StudentService {
    //按主键id查询学生信息
    Student queryStudentById(Integer id);
}
