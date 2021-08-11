package com.bjpowernode.dao;

import com.bjpowernode.model.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * 徐梦凡
 * 2021/6/22
 *
 * @Mapper表示当前类dao，mybatis创建他的代理对象
 * 位置：在接口上面
 */
//@Mapper
public interface StudentMapper {

    //按主键id查询学生信息
    Student selectStudentById(Integer id);
}
