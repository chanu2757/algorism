package com.java.bangtong.Day11;

import java.util.*;

public class LinkedListEx{
    public static void main(String args[]){
        LinkedList<String> queue = new LinkedList<String>();

        queue.offer("one"); queue.offer("two");
        queue.offer("three"); queue.offer("four");

        String s = queue.poll();
        while (s != null){
            System.out.println(s);
            s = queue.poll();
        }
    }
}