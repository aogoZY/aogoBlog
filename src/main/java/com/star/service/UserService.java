package com.star.service;

import com.star.entity.User;

public interface UserService {
    //    核对用户信息
    User checkUser(String username, String password);
}