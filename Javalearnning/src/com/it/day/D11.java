package com.it.day;

public class D11 {
    public static void main(String[] args) {
        //TODO 面向对象-静态   P45  6分钟

       //先有类，再有对象
        Test t = new Test();
        t.test();
        t.test1();
        Test.test1();
    }
}
class Test {
     String name;
     static String sex;
     void test(){
         System.out.println("test");
     }
     static void test1(){
         System.out.println("test1");
     }
}
class Bird1{
    static String type = "鸟";
    static void fly(){
        System.out.println("飞");
    }

    }

