package com.example.config;

import com.example.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
