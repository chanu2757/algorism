package com.java.bangtong.Day11;

import java.util.*;

public class HashMapEx{
    public static void main(String args[]){
        Map<String, Iterator> lectures;
        Map<String, Map> scores = new HashMap<>();

        List<String> names = new ArrayList<String>();
        names.add("김철수"); names.add("이영희");

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String name = it.next();
            if( name.equals("김철수")){
                lectures = new HashMap<String, Integer>();
                lectures.put("국어", 100);
                lectures.put("영어", 95);
                lectures.put("수학", 80);
                scores.put(name, lectures);
            } else {
                lectures = new HashMap<String, Integer>();
                lectures.put("국어", 90);
                lectures.put("영어", 95);
                lectures.put("수학", 95);
            }
        }

        Iterator<String> it2 = names.iterator();
        while (it2.hasNext()){
            String name = it2.next();
            System.out.println(name);

            System.out.print("국어 : ")
            System.out.println(scores.get(name.get("국어")));
            System.out.print("영어 : ")
            System.out.println(scores.get(name.get("영어")));
            System.out.print("수학 : ")
            System.out.println(scores.get(name.get("수학")));
            System.out.println();
        }
    }
}