package com.example.spring.demo4;

import com.example.spring.demo2.UserService;
import com.example.spring.demo2.UserviceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserviceImpl uservice=new UserviceImpl();
        //代理角色
        ProxyInvocationHandler pih=new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(uservice);
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
