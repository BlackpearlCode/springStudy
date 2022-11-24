package com.example.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //获取上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object str = context.getBean("hello");
        System.out.println(str);
    }
}
