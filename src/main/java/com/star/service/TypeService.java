package com.star.service;

import com.star.entity.Type;

import java.util.List;

public interface TypeService {
    List<Type> getAllTypeAndBlog();

    //    分类列表页获取所有type
    List<Type> getAllType();
}
