package com.java.bangtong.Day8;

public class CompareStringEx {
    public static void main(String[] args) {
        final String tmp = "abcd"; long start, end;

        String str = new String();
        StringBuffer sb1 = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        start = System.nanoTime();
        for(int i=0; i < 10000; i++) str = str + tmp;
        end = System.nanoTime();
        System.out.println((end=start)/1000000.0 + " msecs");

        start = System.nanoTime();
        for(int i=0; i<10000; i++) sb1.append(tmp);
        end = System.nanoTime();
        System.out.println((end-start)/1000000.0+" msecs");

        start = System.nanoTime();
        for(int i=0; i < 10000; i++)sb2.append(tmp);
        end = System.nanoTime();
        System.out.println((end-start)/1000000.0 + " msecs");
    }
}
