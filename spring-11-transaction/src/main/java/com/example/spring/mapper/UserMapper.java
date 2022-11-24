package com.example.spring.mapper;



import com.example.spring.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> getAllUser();

    void addUser(User user);
    void deleteUser(String name);
}
