package com.example.spring.test;

import com.example.spring.dao.UserOracleDaoImpl;
import com.example.spring.service.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        UserServiceImpl user=new UserServiceImpl();
        user.setUserDao(new UserOracleDaoImpl());

        user.getUser();
    }
}
