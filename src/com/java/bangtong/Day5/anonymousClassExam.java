package com.java.bangtong.Day5;

/**
 * anonymousClassExam
 */
public class anonymousClassExam {
    public static void main(String[] args) {
        CSuper sub = new CSuper(){
            public int b = 20;
            public void method1(){
                System.out.println("sub1");
            }
            public void method3(){
                System.out.println("sub3");
            }
        };
        sub.method1();
        sub.method2();
        System.out.println(sub.a);
        //sub.method3(); 컴파일 오류
        //System.out.println(sub.b); 컴파일 오류
    }
}

class CSuper{
    public int a = 10;
    public void method1(){
        System.out.println("super1");
    }
    public void method2(){
        System.out.println("super2");
    }
}