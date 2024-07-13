package com.it.day;

public class Day03 {
    public static void main(String[] args) {
        //TODO  2024.7.13笔记

        //重复执行（循环执行）：根据条件重复执行某段代码

        /*1.while:
            有条件循环
            语法结构：while（条件表达式）{需要循环的代码}
          2.do...while:
            语法结构：do{
                         循环代码
                    }while（条件表达式）
          3.for:
          语法结构：for(初始化表达式；条件表达式；更新表达式){
                      循环的代码
                  }
         */


        /*
        while循环：
        判断条件表达式的结果是否为true,如果为false，跳出循环结构，
        如果为true，会执行大括号内的逻辑代码，代码执行完毕后，会重新对条件表达式进行判断
        先判断，后打印
        */

        /*int age = 30;
        while (age < 40){
            System.out.println("循环的代码");
        }

        System.out.println("----------------------");*/

        //do.while:先执行，后判断
        //语法执行原理和while语法基本相同，区别就在于循环代码是否至少执行一次
        //while循环语法可能执行，可能不执行
        //do.while循环语法中的循环代码至少执行一次
        /*int age1 = 40;
        do{
            System.out.println("循环的代码");
        }while(age1 < 40);*/

        System.out.println("----------------------");

        //for:如果条件表达式返回结果为false，那么跳过循环语句，直接执行后续代码
        //如果返回结果为true,那么执行循环代码
        //初始化表达式用于对条件表达式中使用到的变量进行初始化
        //循环代码执行后，会重新进行条件表达式的判断，如果判断结果为true,会重复执行循环代码
        //break关键字直接会跳出循环，不再执行循环后续的操作
        //continue关键字直接会跳过当前循环，执行下一次循环
        for (int i = 0;i < 10;i++){
            if(i == 4){
                //切断，跳出循环
                //break；
                continue;
            }
            System.out.println(i);

        }
    }
}
