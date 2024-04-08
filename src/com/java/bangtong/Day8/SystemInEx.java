package com.java.bangtong.Day8;

import java.io.*;
/**
 * SystemInEx
 */
public class SystemInEx {
    public static void main(String[] args) throws IOException{
        // ex1();
        ex2();

    }
    static void ex1 () throws IOException{
        char cInput = 0;
        int i;
        System.out.print("Input a character: ");
        cInput = (char) System.in.read();
        System.out.println(cInput);
        i = System.in.read(); // enter : 13 return
        System.out.println(i);
        i = System.in.read(); // \n : 10 return
        System.out.println(i);
        System.out.println(System.in.available());
    }
    
    static void ex2 () throws IOException{
        String szInputLine;
        int nValue;
        InputStreamReader isr = new  InputStreamReader(System.in);
        BufferedReader is = new BufferedReader(isr);
        System.out.print("Input a number : ");
        szInputLine = is.readLine();
        nValue = Integer.parseInt(szInputLine);
        System.out.println(nValue);
        is.close();
    }
}