package com.java.bangtong.Day8;

class MyClass1 {} 
class MyClass2 extends Object {
    public String toString() {
        return "This MyClass2 class";
    }
}
public class ToStringEx {
    public static void main(String args[]){
        MyClass1 my_class1 = new MyClass1();
        MyClass2 my_class2 = new MyClass2();
        System.out.println(my_class1.toString());
        System.out.println(my_class2.toString());
        System.out.println(my_class1);
        System.out.println(my_class2);        
    }
}
