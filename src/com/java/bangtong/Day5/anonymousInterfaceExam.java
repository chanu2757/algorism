package com.java.bangtong.Day5;

/**
 * anonymousClassExam
 */
public class anonymousInterfaceExam {
    public static void main(String[] args) {
        InnerInterface sub = new InnerInterface(){
            public void method(){
                System.out.println("sub1");
            }
        };
        sub.method();
    }
}

interface InnerInterface {
    public void method();
}