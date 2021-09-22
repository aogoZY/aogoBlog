package com.star.dao;

import com.star.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


//@Mapper注解：让Mybatis找到对应的mapper，在编译的时候动态生成代理类，实现相应SQL功能
//@Repository注解：用来声明dao层的bean
//@Param注解：将参数传递给SQL

@Mapper
@Repository
public interface UserDao {
    User findByUserNameAndPassword(@Param("username") String userName, @Param("password") String password);

}
