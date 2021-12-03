package com.star.dao;

import com.star.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TypeDao {
    //    新增分类
    int saveType(Type type);

    //    删除分类

    int deleteType(long id);

    //    更新分类
    int updateType(Type type);

    //    查询所有分类
    List<Type> getAllType();


    //  根据typeid查询分类
    Type getTypeById(long id);

    //    根据type name查询分类
    Type getTypeByName(String name);

    List<Type> getAllTypeAndBlog();


}
