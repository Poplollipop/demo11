package com.example.demo11;

public class Daughter extends Father {
    public Daughter(){
        super();
    }
    
    
    
    public Daughter(String name){
        super(name);
    }
    public void shopping(){
        System.out.println(getName() + " is shopping!");
    }
}
