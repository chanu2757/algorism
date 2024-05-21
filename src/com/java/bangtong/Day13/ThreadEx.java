package com.java.bangtong.Day13;

class MyThread extends Thread{
    public void run() {
        for( int i=0; i < 10; i++){
            System.out.println(getName());
        }        
    }
}

public class ThreadEx {
    public static void main(String[] args) {
        Thread t1 = new MyThread(); t1.start();
        Thread t2 = new MyThread(); t2.start();
        System.out.println("main");
    }
}
