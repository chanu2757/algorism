package com.java.bangtong.Day5;

public class Polymophismexam {
    public static void main(String args[]){
        A a = new B();
        a.func();
        a = new C();
        a.func();
    }    
}

class A{
    public void func(){
        System.out.println("A");
    }
}

class B extends A {
    public void func(){
        System.out.println("B");
    }
}

class C extends B {
    public void func(){
        System.out.println("C");
    }
}
