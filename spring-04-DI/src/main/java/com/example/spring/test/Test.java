package com.example.spring.test;

import com.example.spring.pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) context.getBean("student");
        Student stu= (Student) context.getBean("student");
        System.out.println(student);
        System.out.println(student==stu);
    }
}
