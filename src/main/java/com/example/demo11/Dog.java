package com.example.demo11;

public class Dog {
    // 宣告屬性(特性)
    String category;

    String color;

    String name;

    int age;

    // 定義方法(行為)
    public void run() {
        System.out.println(" Running.");
    }

    // 方法的多載(overload)
    // 1.方法名稱一樣，但是方法中的參數個數不一樣，呼叫 run 方法時可以辨別是呼叫無參數還是有參數的方法
    public void run(String name) {
        System.out.println(name + " is running.");
    }
    // // 2.方法名稱一樣，且方法中的參數個數一樣，但是參數內相同位置的資料型態不一樣
    // public void run(String category) {
    // System.out.println(category + " is running.");
    // }

    public void running() {
        System.out.println(name + " is running.");
    }

    public void eat(String name) {
        // 印出：Name 很愛吃變成 Name2
        System.out.println(this.name + "很愛吃變成" + name);
        // ！！！！！於類別變數名稱加上 this. 可區別方法變數中相同名稱 ！！！！！
        // 或是直接變更與類別參數相同的方法參數名稱
    }
}
