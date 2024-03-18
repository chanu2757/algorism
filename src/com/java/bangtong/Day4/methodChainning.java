package com.java.bangtong.Day4;

class People{
    String name;
    int age;
    String address;

    public String getName(){
        return name;
    }
    public People setName(String name){
        this.name = name; // 매개변수명도 name이기때문에 this를 생략할 수 없다.
        return this;
    }
    public int getAge(){        
        return age;
    }

    public People setAge(int age){
        this.age = age;
        return this;
    }
    public String getAddress(){        
        return address;
    }

    public People setAddress(String address){
        this.address = address;
        return this;
    }
}

public class methodChainning {
    public static void main(String[] args) {
        People p = new People();
        // p.setName("홍길동");
        // p.setAge(30);
        // p.setAddress("서울");
        p.setName("홍길동").setAge(30).setAddress("서울");
    }
}
