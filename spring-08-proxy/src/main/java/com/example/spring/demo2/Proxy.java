package com.example.spring.demo2;

public class Proxy implements UserService{


    private UserviceImpl uservice;

    public void setUservice(UserviceImpl uservice) {
        this.uservice = uservice;
    }

    @Override
    public void add() {
        log();
        uservice.add();
    }

    @Override
    public void del() {
        log();
        uservice.del();
    }

    @Override
    public void update() {
        log();
        uservice.update();
    }

    @Override
    public void query() {
        log();
        uservice.query();
    }

    public void log(){
        System.out.println("打印日志");
    }
}
