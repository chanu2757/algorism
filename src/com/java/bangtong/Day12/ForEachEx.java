package com.java.bangtong.Day12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * forEachEx
 */
public class ForEachEx {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Kim","Lee","Park");

        //외부 반복
        for (String name : names){
            System.out.println(name);
        }

        Iterator<String> iterator = names.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //내부 반복
        names.forEach(item -> System.out.println("내부 반복:" + item));
    }
}