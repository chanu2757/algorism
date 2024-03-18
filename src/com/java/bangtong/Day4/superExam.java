package com.java.bangtong.Day4;

class Circle2{
    public double radius;
    
    public Circle2(double a){
        radius = a;
    }
    public Circle2() {

    }
    public double getArea(){        
        return radius*radius*3.14;
    }
    public double getRadius(){
        return radius;
    }
}

class Cylinder2 extends Circle2{
    private double height;
    static final double PI = 3.14;

    public Cylinder2(){
        super(); // 없어도 자동적으로 들어간다.
        height = 1.0;
    }
    public Cylinder2(double radius, double h){
        super(radius);
        this.height = h;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        this.height =h;
    }
    public double getArea(){
        return 2 * PI * getRadius() * height + 2 * super.getArea();
    }
    public double getVolume(){
        return super.getArea() * height;
    }

    public String toString(){
        return "Cylinder of raius =" + getRadius() + "height = "+ height;
    }
}


public class superExam {
    public static void main(String args[]) {
        System.out.println(new Cylinder2(3,10).getVolume());
    }
}
