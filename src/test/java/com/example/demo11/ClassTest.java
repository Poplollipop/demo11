package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ClassTest {
    // @Test
    // public void dogTest() {
    //     // 使用關鍵字 new 建立實例(instance)
    //     Dog myDog = new Dog();
    //     // 設立每個實例不同屬性(特性)
    //     myDog.category = "Mixed";
    //     myDog.color = "Yellow";
    //     myDog.name = "Xavier Chen";
    //     myDog.age = 25;

    //     System.out.println("Dog's category: " + myDog.category);
    //     System.out.println("Dog's color: " + myDog.color);

    //     // =======================
    //     // 使用方法(行為)
    //     myDog.run();
    //     myDog.running();
    //     myDog.eat("Fat Chen");
    // }

    // @Test
    // public void BankTest(){
    //     Bank bank = new Bank();
    //     bank.setUser("Xavier Chen");
    //     bank.setBalance(1000);
    //     System.out.println("銀行分行：" + bank.getBranch() + " 銀行用戶： "+ bank.getUser() +" 銀行餘額： "+ bank.getBalance());

    //     bank.saving(100);
    //     bank.withdraw(5000);
    // }
    @Test
    public void BankTest(){
        Bank bank = new Bank();
        bank.setBranch("Tainan");
        bank.setUser("user");
        bank.setBalance(1000);

        Bank bank1 = new Bank("Tainan","name",1500);
    }

    @Test
    public void BankTest2(){
        // withdraw31 是靜態方法，可以直接透過 類別名稱.靜態方法 呼叫
        Bank.withdraw31("Tainan", "Tainan", "User", 0);

        // withdraw3 是一般方法，必須要先把類別以 new 方式定義後才可呼叫
        Bank bank = new Bank();
        bank.withdraw3("Tainan", "Tainan", "User", 0);
    }

    @Test
    public void stringTest3(){
        String str = "ABACDWDX";
        String newStr = str.replace("A", "Z");
        String newStr1 = str.replaceAll("A", "Z");
        System.out.println(newStr);
        System.out.println(newStr1);

        String newStr2 = str.replaceAll("[A-C]", "Z");
        System.out.println(newStr2);
    }
}