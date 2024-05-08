package com.java.bangtong.Day12;

import java.util.*;

public class MappingEx {
    public static void main(String[] args) {
        //String 배열을 IntStream으로 변환
        String[] strNums = {"10", "20", "30"};
        Arrays.stream(strNums)
              .mapToInt(item -> Integer.parseInt(item))
              .forEach(item -> System.out.println(item));

        //int 배열을 Stream<String>으로 변환
        int[] numbers = {10, 20, 30};
        Arrays.stream(numbers)
              .mapToObj(item -> String.valueOf(item))
              .forEach(item -> System.out.println(item + "(" + item.length() + ")"));

    }
}
