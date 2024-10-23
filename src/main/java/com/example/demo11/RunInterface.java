package com.example.demo11;

public interface RunInterface {
    public default void running(String name){
        System.out.println(name +" is running");
    }

    public void running2(String name);
}
