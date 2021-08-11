package com.bjpowernode.web;

import javax.servlet.*;
import java.io.IOException;

/**
 * 徐梦凡
 * 2021/6/22
 */
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行自定义过滤器MyFilter的doFilter()方法。。。");
        filterChain.doFilter(servletRequest, servletResponse);

    }
}
