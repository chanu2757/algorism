package com.java.bangtong.Day5;

class OuterClass{
    public int x =0;

    class InnerCalss {
        public int x = 1;
        void methodInnerClass(int x){
            System.out.println("x = "+ x);
            System.out.println("this.x =" + this.x);
            System.out.println("OuterClass.this.x =" + OuterClass.this.x);
        }
    }
}
public class duplicateClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerCalss ic = oc.new InnerCalss();
        ic.methodInnerClass(5);
    }
}
