package com.star.interceptor;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//登录过滤拦截器 没有登录的情况下不能让游客访问管理页面

//继承HandlerInterceptorAdapter适配器，重写预处理方法preHandle
//        对session进行判断，看是否有用户，没有的话重定向到登录页面，给拦截掉
//        还需要指定拦截的内容
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/admin");
            return false;
        }
        return true;

    }


}
