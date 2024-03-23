package com.java.bangtong.Day5;

public class InterfaceExam {
    public static void main (String args[]){
        Triangle t= new Triangle(3.0, 4.0);
        System.out.println(t.getArea());
    }
}

interface Figure{
    double getArea();
}

class Triangle implements Figure{
    private double height, width;

    public Triangle(double h, double w){
        height = h;
        width = w;
    }

    @Override
    public double getArea() {
        return height * width * 0.5;
    }
    
}

interface Comparable<T> {
    boolean isLargerThan(T o);
    
}

class Box implements Comparable<Box> {
    private int length, width, height;
    public boolean isLargerThan (Box otherBox){
        return false;
    }
}