package com.example.test;

import com.example.pojo.People;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("name", People.class);
        people.getCat().shout();
        people.getDog().shout();
        System.out.println(people.getName());
    }
}
