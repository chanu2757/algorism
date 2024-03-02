package com.java.bangtong;

class Grade {
    int e;
    int m;

    void output_grade(){
        System.out.println(e+m);
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, Java Application!");
        
        Grade g1, g2;
        g1 = new Grade();
        g2 = new Grade();

        g1.e = 90;
        g1.m = 85;
        g2.e = 80;
        g2.m = 80;

        g1.output_grade();
        g2.output_grade();
    }
}
