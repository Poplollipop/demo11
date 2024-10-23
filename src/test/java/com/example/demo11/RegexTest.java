package com.example.demo11;

import org.junit.jupiter.api.Test;

public class RegexTest {

    // @Test
    // public void test0() {
    //     // \ 在java中表示跳脫符號，用來跳脫有特殊意義的符號 --> 讓有特殊意義的符號變成單純的字串
    //     // \ 跳脫符號無法單純存在
    //     // \\ -->第一個 \ 代表跳脫符號 讓第二個 \ 變成無意義單純的字串
    //     String pattern = "\\";
    //     // 電腦路徑也會直接新增 \
    //     System.out.println(pattern);
    // }

    // @Test
    // public void test() {
    //     // 比對手機號碼格式：數字4碼-數字3碼-數字3碼
    //     // \d 表示數字 0~9 的任意其中一個數
    //     String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";

    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Please enter your phone number(xxxx-xxx-xxx): ");
    //     String input = scan.next();
    //     boolean check = input.matches(pattern);
    //     if (check) { // 等同於check == true
    //         System.out.println("The number is correct.");
    //     } else {
    //         System.out.println("The number is wrong.");
    //     }

    //     // ===================
    //     // 上面input.matches(pattern)結果用變數 check 接回
    //     // 但後續程式碼中，變數check 只使用一次
    //     // 所以可以使用匿名(不需要用變數名稱接計算結果)方式改寫
    //     // if內變數 check可以直接以input.matches(pattern) 替代
    //     if (input.matches(pattern)) {

    //         // 等同於input.matches(pattern) == true
    //         System.out.println("The number is correct.");
    //     } else {
    //         System.out.println("The number is wrong.");
    //     }
    // }

    // @Test
    // public void test1() {
    //     // 比對手機號碼格式：數字4碼-數字3碼-數字3碼
    //     // \d 表示數字 0~9 的任意其中一個數
    //     // String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
    //     // 使用大括號 {} 處理pattern 中重複字串，但僅限於{}前面字串
    //     String pattern = "\\d{4}-\\d{3}-\\d{3}";

    //     // 使用小括號() 分類組成群組
    //     // 上一行 -\\d{3} 重複出現2次，所以用小括號將 -,\\d,{3 }三個字串組成一個群組後，利用大括號去處理重複部分
    //     String pattern1 = "\\d{4}(-\\d{3}){2}";
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Please enter your phone number(xxxx-xxx-xxx): ");
    //     String input = scan.next();
    //     if (input.matches(pattern)) {
    //         System.out.println("The number is correct.");
    //     } else {
    //         System.out.println("The number is wrong.");
    //     }
    // }

    // @Test
    // public void test2() {
    //     String input1 = "06-1234567";
    //     // Scanner scan = new Scanner(System.in);
    //     // // 市話格式1： 數字2碼-數字7碼
    //     // String pattern1 = "\\d{2}-\\d{7}";
    //     // // 市話格式2： (數字2碼)-數字7碼
    //     // String pattern2 = "\\(\\d{2}\\)-\\d{7}";
    //     // System.out.println("Please enter your phone number(xx-xxxxxxx or
    //     // (xx)-xxxxxxx): ");
    //     // String input = scan.next();
    //     // if (input.matches(pattern1) || input.matches(pattern2)) {
    //     // System.out.println("The number is correct.");
    //     // } else {
    //     // System.out.println("The number is wrong.");
    //     // }
    //     // // ===============
    //     // // 合併 pattern1 和 pattern2
    //     // String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
    //     // if (input.matches(pattern3)) {
    //     // System.out.println("The number is correct.");
    //     // } else {
    //     // System.out.println("The number is wrong.");
    //     // }
    //     String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}";
    //     if (input1.matches(pattern4)) {
    //         System.out.println("The number is correct.");
    //     } else {
    //         System.out.println("The number is wrong.");
    //     }
    // }
    // // 注意上述 | 左右字串不要留下空白

    // @Test
    // public void test3() {
    //     // 市話格式：數字2碼-數字7碼或8碼
    //     String pattern = "\\d{2}-(\\d{7}|\\d{8})";
    //     // \\d{7,8} \\d表示最少出現7次，最多出現8次
    //     String pattern1 = "\\d{2}-\\d{7,8}";
    // }

    // @Test
    // public void test4() {
    //     String pattern = "[A-Za-z]"; // 不能直接A到z，因為ASCII十進位制有包含特殊符號
    //     String pattern2 = "[A-CSW-Z]"; // 符合字母有： A、B、C、S、W、X、Y、Z 8個字母
    //     String str = "_";
    //     System.out.println(str.matches(pattern));
    // }

    @Test
    public void practice() {
        // 市內電話號碼比對
        // 使用範圍符號 []
        // 區碼 0 開頭，總共會有 2~4 碼
        // 剩下3碼不得為0
        // 電話號碼 7~8 碼
        // 區碼和號碼中間以 – 連接，例如 02-12345678
        String pattern = "0[1-9]{1,3}-\\d{7,8}";
        String str = "013-1234567";
        System.out.println(str.matches(pattern));
    }

    @Test
    public void test6(){
        String pattern = "^aB$"; // 當作開頭時無需中括號，中括號為一範圍
        String str1 = "aB";
        String str2 = "AB";
        System.out.println(str1.matches(pattern));
        System.out.println(str2.matches(pattern));
    }
}
