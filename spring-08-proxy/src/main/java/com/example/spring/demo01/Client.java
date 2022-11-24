package com.example.spring.demo01;

public class Client {
    public static void main(String[] args) {
        Hoster hoster=new Hoster();
        Proxy proxy = new Proxy(hoster);
        proxy.rent();
    }
}
