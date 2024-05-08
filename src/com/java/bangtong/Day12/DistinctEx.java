package com.java.bangtong.Day12;

import java.util.ArrayList;
import java.util.List;

class Book{
    String title, author;
    int price;
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString(){
        return ("title : "+ title + "author :" + author + "price :"+ price );
    }
    
}
public class DistinctEx {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("JAVA 프로그래밍","홍길동",10000));
        books.add(new Book("PHP 프로그래밍","이순신",20000));
        books.add(new Book("빅데이터 연구","유관순",12000));
        books.add(new Book("커뮤니케이션 이론","강감찬",15000));
        books.add(new Book("PHP 프로그래밍","이순신",20000));
        books.add(new Book("알고리즘","권율",17000));

        books.stream()
                .distinct()
                .forEach(book -> System.out.println(book));
    }
}
