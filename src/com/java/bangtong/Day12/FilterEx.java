package com.java.bangtong.Day12;

import java.util.Arrays;
import java.util.List;

public class FilterEx {
    public static void main(String[] args) {
        String[] strArray = {"ABC", "BCD", "AFE", "CDE", "ABZ", "ACCZ"};
        List<String> strList = Arrays.asList(strArray);
        strList.stream()
                .filter(item -> item.startsWith("A"))
                .filter(item -> item.endsWith("Z"))
                .filter(item -> item.length() > 3)
                .forEach(item -> System.out.println(item));
        
        strList.stream() 
               .filter(item -> item.startsWith("A") & item.endsWith("Z") & item.length() > 3)
               .forEach(item -> System.out.println(item));
    }
}
