package com.java.bangtong;

public class jump {
    
    public void jumpTest(){
        int nSum =0;
        my_loop: for(int i=1; i<= 10; i++){
            if(i % 2 ==0){
                continue my_loop;
            }
            nSum += i;
        }
        System.out.println(nSum);
    }

    public void breakTest(){
        int indx1 = 3;
        int indx2 = 3;
        indx1 : for(int i=0; i<indx1; i++){
            indx2 :for(int j=0; j<indx2; j++){
                if(i==2){
                    break indx1;
                }
                System.out.print(indx2);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        jump con = new jump();
        jump brk = new jump();
        // con.jumpTest();
        con.breakTest();
    }    
}
