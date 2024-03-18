package com.java.bangtong.Day4;

class Cylinder{
    private Circle c;
    private int height;

    public Cylinder(Circle a, int b){
        c = a;
        height = b;
    }

    public double getVolume(){
        return c.getArea() * height;
    }
}

class Circle{
    double radius;

    public Circle(double a){
        radius = a;
    }
    
    public double getArea(){
        return radius * radius * 3.14;
    }
}

public class classExam {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Cylinder cy = new Cylinder(c, 10);
        System.out.println(cy.getVolume());
    }
}
