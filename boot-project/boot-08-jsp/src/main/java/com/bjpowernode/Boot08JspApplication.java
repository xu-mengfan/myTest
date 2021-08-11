package com.bjpowernode;

import com.bjpowernode.service.UserService;
import com.bjpowernode.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Boot08JspApplication {

    public static void main(String[] args) {

        //run方法的返回值也是一个容器
        ApplicationContext ctx = SpringApplication.run(Boot08JspApplication.class, args);
        UserService userService = (UserService) ctx.getBean("UserService");
        userService.add("lisi", 22);


    }

}
