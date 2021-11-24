package com.star.service;

import com.star.entity.Type;

import java.util.List;

public interface TypeService {
    List<Type> getAllTypeAndBlog();

    //    分类列表页获取所有type
    List<Type> getAllType();

    //    根据分类名称查询分类信息
    Type getTypeByName(String name);

    //    新增分类名称
    int saveType(Type type);

    //    根据id查询分类信息
    Type getTypeById(long id);


    //更新type信息
    int updateType(Type type);

    //            删除type
    int deleteTypeById(long id);
}
