package com.java.bangtong.Day4;
import java.awt.Point;

class IniTest{
    static int nStatic = 0;
    int nValue = 1;
    
    {
        nValue = 2;
    }
    static {
        nStatic = 1;
    }
    public IniTest(){
        nValue =3;
    }
}

class Rectangle{
    public int width = 0;
    public int height = 0;
    public Point origin;

    public Rectangle() {
        origin = new Point(0,0);
    }
    public Rectangle(Point p, int w, int h){
        origin = p;
        width = w;
        height = h;
    }
}

public class StaticTest {
    public static void main(String args[]){
        Point originOne = new Point(33, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
    }
}