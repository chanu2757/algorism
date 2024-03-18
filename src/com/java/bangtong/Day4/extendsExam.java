package com.java.bangtong.Day4;

class CSuper{
    private int f1;
    public int f2;

    public void setPrivate(int i){
        f1 = i;
    }
    public void setPublic(int i){

    }
    private void mPrivate(){

    }
}

class CSub extends CSuper{
    private int f3;
    public int f4;
}

public class extendsExam {
    public static void main(String[] args) {
        CSub sub = new CSub();

        //sub.f1 =40; // 오류 private >> 해당 클래스에서만 가능
        sub.f2 = 50;
        //sub.f3 = 60; //오류 private 
        sub.f4 = 70;
        sub.setPrivate(10);
        sub.setPublic(20);
        //sub.mPrivate(); //오류 private

    }
}
