package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ExtendsTest {

    @Test
    public void animalTest() {
        Animal ani = new Animal();
        ani.setName("ANY");
        ani.eat();
        ani.sleep();
    }

    @Test
    public void animalTest2() {
        Animal ani = new Animal("ANY", 5);
        ani.eat();
        ani.sleep();
    }

    @Test
    public void birdTest() {
        Bird bird = new Bird();
        bird.setName("BIRD");
        bird.eat();
        bird.sleep();
        bird.flying();
    }

    @Test
    public void birdTest2() {
        Bird bird = new Bird("BIRD", 5);
        bird.eat();
        bird.sleep();
        bird.flying();
        bird.flying2();
    }

    // @Test
    // public void extendsTest2(){
    // Father father = new Father("Jack");
    // Son son = new Son("Ace");
    // Daughter daughter = new Daughter("Kate");
    // father.walk();
    // son.walk();
    // son.playBall();
    // daughter.walk();
    // daughter.shopping();
    // }

    @Test
    public void birdTest3() {
        // 雖然接回的資料型態是父類別，但因為 new 出來的是子類別，所以本質上就是是子類別
        Animal bird = new Bird("BIRD", 5);
        // eat() 和 sleep() 執行實作內容會是子類別被重新定義後的實作內容
        bird.eat();
        bird.sleep();
        // 以下2個方法無法被呼叫，因為沒有被定義在父類別中
        // bird.flying();
        // bird.flying2();
        // 綜合以上，當新建立出來的子類別實例其接收的資料型態是父類別時
        // 1. 只能呼叫父類別中的方法
        // 2. 當子類別有重新定義父類別的方法時，執行的會是子類別的實作內容
    }

    @Test
    public void birdTest4() {
        Bird bird = new Bird("BIRD", 5);
        // 執行的是定義在 Bird 中的實作內容
        bird.flying();
        // 重新定義 flying() 的方法
        // 1. 在建立新的實例時直接給予新的實作內容，即加上大括號
        // 2. 大括號要加在分號( ; )之前，結尾一定是分號
        // 3. 重新定義實作內容就僅此在這次執行
        // 4. @Override 可有可無，但建議加
        Bird bird2 = new Bird("BIRD", 5) {

            @Override
            public void flying() {
                System.out.println( getName()+ "慢慢飛");
                ;
            }
        };
        bird2.flying();
    }
}
