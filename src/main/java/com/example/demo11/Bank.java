package com.example.demo11;

public class Bank {
    private String branch = "Tainan"; // 屬性可先給予預設值，而不是程式本身預設值(null)

    private String user;

    private int balance;

    private String title;


    // 預設建構方法，格式：方法的存取權限 類別名稱(){}
    //                  public        Bank(){}
    // 預設建構方法 -->就是沒有參數的建構方法
    // 類別中沒有建立帶有參數建構方法時，沒有參數的建構方法就是預設建構方法，省略不寫也可使用
    // 類別中有建立帶有參數的建構方法時，預設建構方法就不再是預設建構方法，沒寫就無法使用
    public Bank(){
        super();
        // TODO Auto-generated constructor stub
    }

    // 帶有參數的建構方法，實作內容等同於set*** 方法，實際作用在於減少程式碼的行數
    public Bank(String branch, String user, int balance){
        super();
        this.balance = balance;
        this.branch = branch;
        this.user = user;
    }

    // 建立屬性的存(get)取(set)方法
    // 一般方法：
    // 格式： 方法的存取權限 方法的回傳值的資料型態 方法名稱(參數資料型態 參數變數名稱){方法的實作內容}
    //          public      String              getBranch(){}
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void saving(int money) {
        System.out.println("Before saving: " + balance);
        // 判斷 money 是否為正數
        if (money >= 0) {
            this.balance = this.balance + money; // balance += m;
        } else {
            System.out.println("The ammount is wrong.");
        }
        System.out.println("After saving: " + balance);
    }

    // ========練習

    // public void withdraw(int money) {
    // System.out.println("Before withdraw: " + balance);
    // if (money < 0) {
    // System.out.println("The ammount is wrong.");
    // }else if(money > balance){
    // System.out.println("No enough money to withdraw.");
    // }else{
    // this.balance = this.balance - money;
    // }
    // System.out.println("After withdraw: " + balance);
    // }
    // public void withdraw(int money) {
    // System.out.println("Before withdraw: " + balance);
    // if (money < 0) {
    // System.out.println("The ammount is wrong.");
    // } else {
    // if (money > balance) {
    // System.out.println("No enough money to withdraw.");
    // } else {
    // this.balance = this.balance - money;
    // }
    // System.out.println("After withdraw: " + balance);
    // }
    // }

    // 老師解答
    public void withdraw(int money) {
        // 排除金額負數
        if (money < 0) {
            System.out.println("The ammount is wrong.");
            return;
        }
        // 排除餘額不足
        if (money > balance) {
            System.out.println("No enough money to withdraw.");
            return;
        }
        System.out.println("Before withdraw: " + balance);
        this.balance -= money;
        System.out.println("After withdraw: " + balance);
    }

    // 呼叫方法時小括號內的參數可使用任何資料型態(包含類別)
    // public void withdraw(Bank bank){
    // }

    // // 多數專案使用類別回傳值會利用return 新增一個類別，其他資料型態回傳時結尾要有 return(跳出方法) + 首端資料型態
    // public Bank withdraw(String branch){
    // return new Bank();
    // }

    // public String withdraw(String branch){
    // return "";
    // }

    public void withdraw2(Bank bank) {
        System.out.println(bank.getBalance());
        System.out.println(bank.getBranch());
        System.out.println(bank.getUser());
    }

    // 上下相同意思(僅是以形參方式或以實參方式建立一個方法，而其呼叫方式也因此不同)
    public void withdraw3(String title, String branch, String user, int balance) {
        System.out.println(branch);
        System.out.println(user);
        System.out.println(balance);
    }

    // 可變參數，僅能將欲可變參數放置於最右側，一個方法僅一個可變參數(本質上為一陣列，無需添加中括號)
    public void withdraw4(int balance, String... params) {
        // params 是陣列，包含title,branch,user
        String title = params[0];
        String branch = params[1];
        String user = params[2];
        System.out.println(branch);
        System.out.println(user);
        System.out.println(balance);
    }

    public static void withdraw31(String title, String branch, String user, int balance) {
        System.out.println(branch);
        System.out.println(user);
        System.out.println(balance);
    }
}
