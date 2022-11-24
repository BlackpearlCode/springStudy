package com.example.mapper;

import com.example.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getAllUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getAllUser();
    }

}
