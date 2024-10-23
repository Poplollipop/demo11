package com.example.demo11;

import org.junit.jupiter.api.Test;

public class HelloTest{

    @Test // 要使用單元測試必須加上此 annotation
    public void helloTest() {
        // syso + alt + / ，即可快速呼叫系統列印
        System.out.println(this.helloMaker("hello"));
        // this 是用於呼叫方法大括號外的方法或變數時，才需要添加
        // 呼叫方法時，不論有沒有傳入參數，都必須加上小括號
        // 如：this.大括號外的方法名稱(參數)
        System.out.println(this.helloMaker2("hello", "bye"));
    }

    public String helloMaker(String inString){
        // 因為宣告方法時，有要求回傳字串，故必須 return字串，才不會錯誤
        return inString+"world";
    }
// 在參數名稱前面加上 ...即可輸入不只一個參數，而傳入的參數會以陣列(array，資料組成的一長列)的方式儲存
// 此時的參數名稱會代表此陣列的儲存位置(記憶體空間)，要取用陣列內的內容需要加上 [索引位置]
// 並且記得，程式的索引位置通常以0為起始值
    public String helloMaker2(String ...inString){
        return inString[1]+"world";
    }

    @Test
    public void staticFinalTest(){
        // 因為 PI 被加上了 static 的前綴，所以不能再被修改
        // 而因為 PI 本身就有 static 所以不需要先創建才能使用，而是大家都存取同一個記憶體空間的值
        // 創建是指建立一個記憶體空間給該物件
        System.out.println(Math.PI);
    }
    @Test
    public void variableTest() {
        // 數值
        // 強制轉型，值前面加上(要轉型成的資料型態)
        byte a = 2;
        short b = 3;
        int c = 128;
        a = (byte)c;
        long d = 5;
        System.out.println(a);
        // - 浮點數(小數點)
        float g = (float) 0.5;
        double h = 0.5;
        h = g;
        // 字元
        char i = 'C';
        char l = 65; // 當使用數字放入 char 的容器中時，程式會自動解讀為文字編碼，找到數字對應的文字
        System.out.println(l);
        // 布林值
        boolean j = true;
        boolean k = false;

        // 容器賦值的流程
        int res = 5/2;
        System.out.println(res);
        // 當沒有小數點時，程式會自動將數字理解為 int(整數)，因此計算結果也會是以整數呈現
        System.out.println(5/2);
        System.out.println(5/2.0);
        // 只要任一數為小數，程式就能以小數方式計算
        double res2 = (double)(5/2);
        // 程式執行順序會以整數5與整數2相除，再將結果轉為小數點，結果會是2.0非2.5
        System.out.println(res2);
    }

    @Test
    public void hardCodeTest() {
        // 將實作內容直接寫死，不易未來維護使用
        int sum = 1 + 2;
        System.out.println(sum);

        int add1 = 1;
        int add2 = 2;

        // 將實作內容用兩個變數包裝起來，方便未來修改值的內容(只要修改變數)
        int sum2 = add1 + add2;
        System.out.println(sum2);
        System.out.println(add1 + add2);
        // 省略只使用一次 sum2 變數，為匿名變數
    }
    @Test
    public void stringTest(){
    // 測試基本資料型態的判斷
    int a = 1;
    int b = 1;
    System.out.println(a == b);

    String c = "a";
    String d = "a";
    String e = new String("a");
    System.out.println(c == d);
    System.out.println(e);
    System.out.println(c == e);
    
    // 類別與基本資料型態的差異
 //   int a1 = null;
    Integer a2 = null;
    }

}

