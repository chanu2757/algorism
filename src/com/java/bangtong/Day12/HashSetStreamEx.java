package com.java.bangtong.Day12;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class HashSetStreamEx {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i < 10; i++){
            set.add(i);
        }

        //일반 스트림 사용
        System.out.println("일반 스트림 사용");
        Stream<Integer> n_stream = set.stream();
        n_stream.forEach(item -> System.out.println(item));

        //병렬 스트림 사용
        System.out.println("병렬처리 스트림 사용");
        Stream<Integer> p_stream = set.parallelStream();
        p_stream.forEach(item -> System.out.println(item + "("+Thread.currentThread().getName()+")"));

        /*
         *             >병렬처리 프레임워크
         * ___________/
         * ForkJoinPool.commonPool-worker-x : x번 쓰레드에서 출력되었다.
         * main : main 쓰레드에서 출력되었다.
         * 
         */
    }
}
