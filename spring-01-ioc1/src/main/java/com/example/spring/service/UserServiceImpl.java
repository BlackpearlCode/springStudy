package com.example.spring.service;

import com.example.spring.dao.UserDao;
import com.example.spring.dao.UserDaoImpl;
import com.example.spring.dao.UserMysqlDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
