package com.it.day;

public class D02Test {
    public static void main(String[] args) {
        //TODO  分支执行-练习
        //int age = 45;
        //儿童（0-6），少年（7-17），青年（18-40），中年（41-65），老年（66）
        //if...else if... else if... else:多分支判断
        //switch...case...case...default:等值分支判断
        /*
        if (age < 7){
            System.out.println("儿童");
        }else if (age >= 7 && age < 18){
            System.out.println("少年");
        }else if (age >= 18 && age < 41){
            System.out.println("青年");
        }else if (age >= 41 && age < 66){
            System.out.println("中年");
        }else {
            System.out.println("老年");
        }*/

        System.out.println("----------------------------");

        //优化
        int age = 45;
        if (age < 7){
            System.out.println("儿童");
        }else if (age < 18){
            System.out.println("少年");
        }else if (age < 41){
            System.out.println("青年");
        }else if (age < 66){
            System.out.println("中年");
        }else {
            System.out.println("老年");
        }
    }
}
