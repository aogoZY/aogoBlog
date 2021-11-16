package com.star.dao;

import com.star.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TypeDao {
    List<Type> getAllTypeAndBlog();
}
