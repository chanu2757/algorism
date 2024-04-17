package com.java.bangtong.Day9;
import java.io.*;

public class directoryEx {
    public static void main(String[] args) {
        File file = new File("c:\\windows");
        File files[] = file.listFiles();
        int i = 0;
        while (i < files.length){
            System.out.println(files[i].getPath());
            System.out.println("\t" + files[i].length());
        }
    }
}
