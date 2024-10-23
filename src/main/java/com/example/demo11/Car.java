package com.example.demo11;

public class Car implements RunInterface {

    @Override
    public void running(String name) {
        System.out.println(name + " 正在開");
    }

    @Override
    public void running2(String name) {
        System.out.println(name + " 正在開");
    }
    
}
