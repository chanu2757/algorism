package com.java.bangtong.Day13;

class ThreadMine extends Thread{
    Thread thdNext = null;
    public ThreadMine(String szName){
        super(szName);
    }
    public void run(){
        for(int i=0; i <100; i++){
            try{
                Thread.sleep(100000);                
            } catch(InterruptedException e){
                System.out.print(getName() + " ");
                if(thdNext.isAlive()) thdNext.interrupt();
            }
        }
    }
    public void setNextThread(Thread t) {
        thdNext = t;
    }
}

public class InterruptThreadEx {
    public static void main(String[] args) {
        ThreadMine my_thread1 = new ThreadMine("thd1");
        ThreadMine my_thread2 = new ThreadMine("thd2");
        ThreadMine my_thread3 = new ThreadMine("thd3");

        my_thread1.setNextThread(my_thread2);
        my_thread2.setNextThread(my_thread3);
        my_thread3.setNextThread(my_thread1);

        my_thread1.start(); my_thread2.start();
        my_thread3.start();
        try{
            my_thread1.interrupt();
            my_thread1.join(); my_thread2.join();
            my_thread3.join();
        } catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("main");
    }
}
