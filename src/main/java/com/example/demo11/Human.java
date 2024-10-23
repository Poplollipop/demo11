package com.example.demo11;

public class Human implements RunInterface {

    @Override
    public void running(String name) {
        System.out.println(name + " 人類正在跑");
    }

    @Override
    public void running2(String name) {
        System.out.println(name + " 人類正在跑");
    }
    
}
