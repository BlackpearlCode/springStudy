package com.example.spring.dao;

public class UserMysqlDaoImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("获取Mysql用户");
    }
}
