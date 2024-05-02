package com.java.bangtong.Day11;

import java.util.*;
import java.util.function.Consumer;

public class ArrayListEx{
    public static  void main(String args[]){
        Ex1();
        //Ex2();
        // Ex3();
    }

    public static void Ex1(){
        List<String> list = new ArrayList<String>();

        list.add("one"); list.add("two");
        list.add("three"); list.add(1, "one");
        list.add("five");

        System.out.println(list.size());
        System.out.println(list.indexOf("one"));
        System.out.println(list.get(2));
        System.out.println(list.lastIndexOf("one"));
        System.out.println(list.set(3, "four"));
        System.out.println(list.remove(4));
        System.out.println(list.remove("one"));    
    }

    public static void Ex2(){
        List<String> list = new ArrayList<String>();
        list.add("one"); list.add("two");
        list.add("three"); list.add("four");
        list.add("five");

        // for 구문을 이용한 자료 검색
        for (int i=0; i < list.size(); i++)
            System.out.println(list.get(i));

        // 향상된 for 구문을 이용한 자료 탐색
        for (String s : list)
            System.out.println(s);

        // Iterator 인터페이스를 이용한 자료 탐색
        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
    
    public static void Ex3(){
        List<String> list = new ArrayList<String>();
        list.add("one"); list.add("three");
        list.add("two"); list.add(1, "one");

        Consumer<String> con1 = new Consumer<>() {
            public void accept(String t){
                System.out.println(t);
            }
        };
        list.forEach(con1);

        Consumer<String> con2 = t -> System.out.println(t);
        list.forEach(con2);

        list.forEach(t -> System.out.println(t));
    }
}