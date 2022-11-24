package com.example.spring.demo01;

public class Proxy implements Rent{
    private Hoster host;

    public Proxy() {
    }

    public Proxy(Hoster host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        seeHose();
        fare();
    }

    public void seeHose(){
        System.out.println("中间带你看房");
    }

    public void fare(){
        System.out.println("中间收中介费");
    }
}
