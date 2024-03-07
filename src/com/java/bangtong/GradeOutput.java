package com.java.bangtong;

// Class가 하나인 성적처리 프로그램
public class GradeOutput {
    int e;
    int m;

    void input_grade(int a, int b){
        e = a;
        m = b;
    }
    
    void output_grade(){
        System.out.println(e+m);
    }

    public static void main (String args[]){        
        GradeOutput g1, g2;
        g1 = new GradeOutput();
        g2 = new GradeOutput();
        
        g1.input_grade(90, 85);
        g2.input_grade(80, 89);

        g1.output_grade();
        g2.output_grade();
    }
}
