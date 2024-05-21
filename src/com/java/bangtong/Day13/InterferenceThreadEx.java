package com.java.bangtong.Day13;

class Counter{
    private int c = 0;

    public void increment() {c++;}
    public void decrement() {c--;}
    public int value() {return c;}
}

class MyThread1 implements Runnable{
    Counter c;

    public MyThread1(Counter c){
        this.c = c;
    }

    public void run(){
        for(int i=0; i<100000; i++)
            c.increment();
    }
}

class MyThread2 implements Runnable{
    Counter c;
    public MyThread2(Counter c){
        this.c = c;
    }

    public void run(){
        for(int i=0; i<100000; i++)
            c.decrement();
    }
}

public class InterferenceThreadEx {
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();
        Thread t1 = new Thread(new MyThread1(c));
        Thread t2 = new Thread(new MyThread2(c));

        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(c.value());
    }
}
