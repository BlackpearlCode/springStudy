package com.example.spring.demo01;

public class Hoster implements Rent{

    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
