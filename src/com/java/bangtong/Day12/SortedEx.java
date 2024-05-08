package com.java.bangtong.Day12;

import java.util.*;

class Book2 implements Comparable<Book2>{
    String title, author;
    int price;
    Book2(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString(){
        return ("title : "+ title + "author :" + author + "price :"+ price );
    }
    
    public int compareTo(Book2 book){
        return Integer.compare(this.price, book.price);
    }
}

public class SortedEx {
    public static void main(String[] args) {
        List<Book2> books = new ArrayList<Book2>();
        books.add(new Book2("JAVA 프로그래밍","홍길동",10000));
        books.add(new Book2("PHP 프로그래밍","이순신",20000));
        books.add(new Book2("빅데이터 연구","유관순",12000));
        books.add(new Book2("커뮤니케이션 이론","강감찬",15000));
        books.add(new Book2("PHP 프로그래밍","이순신",20000));
        books.add(new Book2("알고리즘","권율",17000));

        books.stream().sorted().forEach(book -> System.out.println(book));
    }
}
