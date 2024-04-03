package com.java.bangtong.Day7;

public class MyException {
    public static void main(String[] args) throws Exception {
        MyExceptionTest exceptionT = new MyExceptionTest();
        exceptionT.testFunc(11);
    }
}

class inputException extends Exception{
    public inputException(){
        super();
    }
    public String toString(){
        return "MyException!!";
    }
}

class MyExceptionTest {
    public void testFunc(int x) throws Exception{
        if (x > 10)
            throw new inputException();
    }
}
