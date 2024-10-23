package com.example.demo11;

public class Son extends Father {

    public Son(){
        super();
    }
    public Son(String name){
        super(name);
    }
    public void playBall(){
        System.out.println(getName() + " is playing ball!");
    }
}
