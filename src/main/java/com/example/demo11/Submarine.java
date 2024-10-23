package com.example.demo11;

public class Submarine extends Boat implements Dive {

    @Override
    public void diving(String name) {
        System.out.println(name + " 下潛中");
    }

    @Override
    public void move(String name) {
        System.out.println(name + " 移動中");
    }
    
    
}
