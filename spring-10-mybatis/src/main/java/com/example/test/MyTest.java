package com.example.test;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    @Test
    public void test1(){
        String resources="mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resources);
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> allUser = mapper.getAllUser();
            System.out.println(allUser);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapperImpl", UserMapper.class);
        System.out.println(userMapper.getAllUser());
    }
}
