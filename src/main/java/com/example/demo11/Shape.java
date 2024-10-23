package com.example.demo11;

//抽象類別不能使用 new 的方式建立實例

public abstract class Shape {
    // 抽象類別可以一般方法和抽象方法

    // 定義一般方法
    // 一般方法可以被定義在一般類別或是抽象類別中
    public void draw(){

    }


    // 抽象方法： 
    // 1. 純定義方法，不能有實作內容(不能有大括號) 
    // 2. 分號( ; )結尾
    // 3. 抽象方法只能被定義在抽象類別中
    // 4. 抽象方法必須要被重新定義(因為只有定義，所以須透過重新定義給予實作內容)
    public abstract  void draw1();
}
