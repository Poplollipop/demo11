package com.example.demo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class CollectionTest {

    @Test
    public void listtest() {
        Bank bank = new Bank();

        List<Integer> intList = new ArrayList<>(); // <>僅能放類別，不能放基本資料型態 ex:int
        // ArrayList<String> strlist =new ArrayList<>(); //
        // 通常不會這樣書寫，若是要更改成LinkedList會有問題

        // 前面List<>若是已添加類別則，後面new ArrayList<> 可不用放類別
        List<Bank> list = new ArrayList<>();
        // List是介面(interface)僅係定義方法並，無任何實作內容，故無法以 new 方式建立實例
        // ArrayList 是實現定義於 List 中的實作類別

        intList.add(1);
        intList.add(2);
        intList.add(1); // 允許元素(element)重複
        intList.add(3);
        intList.add(2, 5); // 指定清單內索引值變更(新增、刪減)，不破壞順序
        for (Integer item : intList) {
            System.out.println(item);
        }
        // 內部資料保持一定順序，依照插入(新增)的順序
    }

    @Test
    public void listtest1() {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(1);
        intList.add(3);
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == 2) {
                intList.remove(intList.get(i));
            }
            System.out.println(intList.get(i));
        }
        // ===========================
        // for(Integer item : intList){
        // System.out.println(item);
        // if(item == 2){
        // intList.remove(item);
        // }
        // }
        // 變更(新增、刪除)List內的值若會使用到迴圈，利用for迴圈(可帶入條件進行比對並變更)
        // for-each迴圈則因變更後長度不同則無法繼續比對
    }

    @Test
    public void listtest2() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        List<String> strlist = new ArrayList<>();
        strlist.add("A");
        strlist.add("B");
        strlist.add("A");
        strlist.add("C");
        System.out.println(strlist.get(0));
        System.out.println(strlist.get(strlist.size() - 1));
    }

    @Test
    public void HashSetTest() {
        // HashSet
        // 1. 相同的元素只會保留一個(不允許重複的元素)
        // 2. 不依照新增順序排序，與 List 相反
        Set<String> strSet = new HashSet<>();
        strSet.add("A");
        strSet.add("C");
        strSet.add("A");
        strSet.add("B");
        strSet.add("F");
        strSet.add("D");
        strSet.add("E");
        strSet.add("B");
        for (String item : strSet) {
            System.out.println(item);
        }
    }

    @Test
    public void linkedHashSetTest() {
        // LinkedhashSet
        // 1. 相同的元素只會保留一個(不允許重複的元素)
        // 2. 依照新增順序排序，與 List 相同
        Set<String> strSet = new LinkedHashSet<>();
        strSet.add("A");
        strSet.add("C");
        strSet.add("A");
        strSet.add("B");
        strSet.add("F");
        strSet.add("D");
        strSet.add("E");
        strSet.add("B");
        for (String item : strSet) {
            System.out.println(item);
        }
    }

    @Test
    public void treeSetTest() {
        // TreeSet
        // 1. 相同的元素只會保留一個(不允許重複的元素)
        // 2. 順序由小到大
        Set<String> strSet = new TreeSet<>();
        strSet.add("A");
        strSet.add("C");
        strSet.add("A");
        strSet.add("B");
        strSet.add("F");
        strSet.add("D");
        strSet.add("E");
        strSet.add("B");
        for (String item : strSet) {
            System.out.println(item);
        }
    }

    // @Test
    // public void practiceTest() {
    // TreeSet<Integer> set = new TreeSet<>();
    // while (set.size() < 5) {
    // int num = (int) (Math.random() * 10) + 1;
    // set.add(num);
    // }
    // for (Integer item : set) {
    // System.out.println(item);
    // }
    // System.out.println("最大的數字：" + set.first());
    // System.out.println("最小的數字：" + set.last());
    // }

    @Test
    public void setAnserTest() {
        TreeSet<Integer> set = new TreeSet<>();
        Random ran = new Random();
        // for(;set.size() <= 5;){
        // }
        // 寫法等同於下方while迴圈
        while (set.size() < 5) {
            // int number = ran.nextInt(1,11); // 1~10的亂數
            // set.add(number);
            // 因變數number，被宣告後於後續程式碼僅使用1次，可以用匿名方式合併，等同於下方語法
            set.add(ran.nextInt(1, 11));
        }
        System.out.println("min: " + set.last());
        System.out.println("max: " + set.first());
        // 由小到大
        System.out.println(set);
        // 由大到小
        System.out.println(set.descendingSet()); // 降冪排列
    }

    @Test
    public void setAnserTest2() {
        Set<Integer> set = new TreeSet<>();
        Random ran = new Random();
        // for(;set.size() <= 5;){
        // }
        // 寫法等同於下方while迴圈
        while (set.size() < 5) {
            // int number = ran.nextInt(1,11); // 1~10的亂數
            // set.add(number);
            // 因變數number，被宣告後於後續程式碼僅使用1次，可以用匿名方式合併，等同於下方語法
            set.add(ran.nextInt(1, 11));
        }
        // 轉型： 將值的資料型態轉換成另一種資料型態
        // 1. 被轉型的資料型態必須用小括號(TreeSet<Integer>)set 新增於變數前
        // 2. 將被轉型資料型態的值與 上述1 以小括號框一起((TreeSet<Integer>) set)，才能使用
        // 3. 慎用
        System.out.println("min: " + ((TreeSet<Integer>) set).last());
        System.out.println("max: " + ((TreeSet<Integer>) set).first());
    }

    @Test
    public void setAnserTest3() {
        Set<Integer> set = new TreeSet<>();
        Random ran = new Random();
        // for(;set.size() <= 5;){
        // }
        // 寫法等同於下方while迴圈
        while (set.size() < 5) {
            // int number = ran.nextInt(1,11); // 1~10的亂數
            // set.add(number);
            // 因變數number，被宣告後於後續程式碼僅使用1次，可以用匿名方式合併，等同於下方語法
            set.add(ran.nextInt(1, 11));
        }

        // 將 Set 轉換成 List
        List<Integer> list = new ArrayList<>(set);
        System.out.println("min: " + list.get(0));
        System.out.println("max: " + list.get(list.size() - 1));
        // 由小到大
        System.out.println(set);

        // 由大到小(treeSet 的反序)
        Collections.reverse(list); // reverse: 反轉順序
        System.out.println(list);
    }

    @Test
    public void mapTest() {
        // Map<key 值的資料型態 , value 的資料型態>
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        // 使用 .get() 透過key值 將對應的 value 取出
        String str = map.get(2);
        System.out.println(str);
        // 遍歷：使用 foreach 將 map 中的 key-value 取出

        // 1. 將 map 轉換 entrySet，item 包含key、value，可以使用 getkey 和 getvalue取值
        for (Entry<Integer, String> item : map.entrySet()) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }
        System.out.println("=============");
        // 2. 將 map 轉換 keySet，每個 item 就表示一個 key，透過 get(item) 將對應的value取出
        for (Integer item : map.keySet()) {
            System.out.println("key: " + item);
            System.out.println("value: " + map.get(item));
        }
        System.out.println("=============");
        // 原本 map 中，已存在 key = 1 以及對應的 value = A;
        // 現在key相同為 1 ，value為 D ，key = 1 其對應的value會變成D(相同key ，對應的value *後蓋前)
        map.put(1, "D");
        // 不同 key，可以有相同或不同的對應value
        map.put(4, "D");

        for (Integer item : map.keySet()) {
            System.out.println("key: " + item);
            System.out.println("value: " + map.get(item));
        }
    }

    @Test
    public void mapTest2() {
        // key-value 是 1對1
        Map<Integer, String> map = new HashMap<>();
        // key-value 是 1對多
        Map<Integer, String[]> map2 = new HashMap<>();
        Map<Integer, List<String>> map3 = new HashMap<>();
        Map<Integer, Set<String>> map4 = new HashMap<>();
        Map<Integer, Map<String, String>> map5 = new HashMap<>();
        // map.containsKey/Value map key/value是否包含值，亦常用
    }

    @Test
    public void mapTest3() {
        // isEmpty(): 詢問集合(List、Map、Set、Collections)或是 Map 其 size(長度) 是否為 0(空的)
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        Set<String> set = new HashSet<>();
        System.out.println(set.isEmpty());
        Map<Integer, String> map = new HashMap<>();
        System.out.println(map.isEmpty());
        // ========
        List<String> list2 = null;
        // 因為 list2 是 null ，所以無法使用 null 透過 .方法() ，執行程式，會產生error
        // 如下行，會產生NullPointerException(空指針錯誤)
        System.out.println(list2.isEmpty());
    }

}