package com.star.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


//addPathPatterns("/admin/**)的意思是这个链接下的都要进入到LoginInterceptor里面去执行
//        * excludePathPatterns("/admin/login")的意思是login的url可以不用进入到SessionInterceptor中，直接
//        * 放过执行。
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                //过滤的路径
                .addPathPatterns("/admin/**").excludePathPatterns("/admin").excludePathPatterns("/admin/login");
    }
}
