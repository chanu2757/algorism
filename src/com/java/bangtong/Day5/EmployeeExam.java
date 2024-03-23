package com.java.bangtong.Day5;

public class EmployeeExam {
    public static void main(String args[]){
        Employee emp1, emp2;
        emp1 = new Sales();
        emp2 = new Development();
        emp1.doJob(); 
        emp2.doJob();    
        /*
         * Employee 클래스에서 doJob이 없으면 컴파일 에러가 나지만
         * Sales,Development에선 없어도 컴파일 에러는 나지않는다.
         * 위 두 객체에서 없으면 선언한 자료형에서 찾아서 사용한다.
         */
    }
}

class Employee{
    int nSalary;
    String szDept = null;
    public void doJob(){
        System.out.println("Do something");
    }
}

class Sales extends Employee{
    public Sales() { szDept = "Sales Dept";}
    public void doJob(){
        System.out.println("Do sales");
    }
}

class Development extends Employee{
    public Development() {szDept = "Dev.Dept";}
    public void doJob(){
        System.out.println("Do development");
    }
}