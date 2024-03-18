package com.java.bangtong.Day4;

class Shape {
    public double getArea(double h, double w){
        return h * w;
    }
}

class Triangle extends Shape{
    public double getArea(double h, double w){
        return h * w * 0.5;
    }
}

public class overridingExam {
    public static void main(String[] args) {
        Shape t= new Triangle();
        System.out.println(t.getArea(3.0,4.0)); // Triangle의 getArea
    }
}
