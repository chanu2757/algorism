package com.java.bangtong.Day3;

class Circle{
    private double r;
    public Circle(double a){
        r = a;
    }
    public double getArea(){
        return r*r *3.14;
    }
    public double getRadius(){
        return r;
    }
}

class Main{
    public static void main(String args[]){
        Circle c = new Circle(5); // 접근제어가 없으므로 같은 패키지내에서 사용가능
        //System.out.println(c.r); //오류 r은 private이므로 같은 클래스에서만 사용가능
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
    
    }
}

