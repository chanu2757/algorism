package com.java.bangtong.Day8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.java.bangtong.Day8.Box;

public class GetClassEx {
    public static void main(String args[]){
        Box box = new Box(20, 30);
        Class c = box.getClass();
        String class_name = c.getName();
        String super_class = c.getSuperclass().getName();
        Field[] fields = c.getDeclaredFields();
        Method[] methods = c.getDeclaredMethods();

        System.out.println("클래스 이름 : " + class_name);
        System.out.println("슈퍼 클래스 이름 : " + super_class);
        System.out.println("필드목록");

        for(int i=0; i < fields.length; i++){
            System.out.println(fields[i]);
        }
        System.out.println("메소드 목록");
        for(int i=0; i< methods.length; i++){
            System.out.println(methods[i]);
        }
    }
}
