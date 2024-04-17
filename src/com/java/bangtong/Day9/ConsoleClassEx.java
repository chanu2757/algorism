package com.java.bangtong.Day9;
import java.io.*;

public class ConsoleClassEx {
    public static void main(String[] args) {
        String name;
        char[] pw;
        Console con = System.console();

        System.out.print("name : ");
        name = con.readLine();
        System.out.print("password :");
        pw = con.readPassword();

        con.printf("name : %s\n", name);
        con.printf("password : %s\n", new String(pw));
    }
}
