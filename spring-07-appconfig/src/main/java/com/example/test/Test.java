package com.example.test;

import com.example.config.JavaConfig;
import com.example.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
