package com.example.spring.mapper;

import com.example.spring.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{



    @Override
    public List<User> getAllUser() {
        User user = new User("张三", "1231");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser("张三");
        return mapper.getAllUser();
    }

    @Override
    public void addUser(User user) {
        getSqlSession().getMapper(UserMapper.class);

    }

    @Override
    public void deleteUser(String name) {
        getSqlSession().getMapper(UserMapper.class);

    }

}
