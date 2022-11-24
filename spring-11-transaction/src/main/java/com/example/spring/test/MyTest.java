package com.example.spring.test;

import com.example.spring.mapper.UserMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = context.getBean("userMapper", UserMapper.class);
        System.out.println(userMapperImpl.getAllUser());
    }
}
