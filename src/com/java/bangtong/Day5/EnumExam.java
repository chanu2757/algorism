package com.java.bangtong.Day5;

public class EnumExam {

    
    public static void main(String[] args) {
        BaseballTeam bt = BaseballTeam.LG;
        System.out.println(bt.winsRate());
    }
}

enum BaseballTeam{
    LG(40, 30), SS(30, 40), KT(20, 50), SK(35, 35), NC(55, 15);

    private final int win;
    private final int lose;

    private BaseballTeam(int win, int lose){
        this.win = win;
        this.lose = lose;
    }

    public double winsRate(){
        return(win * 100.0) / (win + lose);
    }
}
