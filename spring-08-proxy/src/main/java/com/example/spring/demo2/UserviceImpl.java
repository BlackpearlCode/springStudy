package com.example.spring.demo2;

public class UserviceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void del() {
        System.out.println("del");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void query() {
        System.out.println("query");
    }
}
