package com.star.service.Impl;

import com.star.dao.UserDao;
import com.star.entity.User;
import com.star.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String userName, String password) {
        return userDao.findByUserNameAndPassword(userName, password);
    }
}
