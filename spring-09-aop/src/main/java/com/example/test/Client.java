package com.example.test;

import com.example.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理是代理是代理接口
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
