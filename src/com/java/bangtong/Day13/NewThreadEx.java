package com.java.bangtong.Day13;

class NewThread implements Runnable {
    public void run(){
        for(int i=0; i< 10; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class NewThreadEx {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NewThread(), "thd0"); t1.start();
        Thread t2 = new Thread(new MyThread(), "thd1"); t2.start();
        System.out.println("main");
    }
}
