package com.example.spring.demo2;

public class Client {
    public static void main(String[] args) {
        Proxy proxy=new Proxy();
        proxy.setUservice(new UserviceImpl());
        proxy.add();
    }
}
