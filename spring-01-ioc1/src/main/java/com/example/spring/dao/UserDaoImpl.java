package com.example.spring.dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("获取用户");
    }
}
