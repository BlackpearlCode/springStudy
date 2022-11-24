package com.example.spring.dao;

public class UserOracleDaoImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("获取oracle用户");
    }
}
