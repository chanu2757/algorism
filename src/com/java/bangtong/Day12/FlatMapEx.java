package com.java.bangtong.Day12;

import java.util.Arrays;

public class FlatMapEx {
    public static void main(String[] args) {
        Arrays.asList("Hello world, this is java", "Welcome to java world")
              .stream()
              .flatMap(sentence -> Arrays.stream(sentence.split(",")))
              .forEach(word -> System.out.println(word));
    }
}
