package com.it.day;

public class D02 {
    public static void main(String[] args) {
        //TODO  2024.7.13笔记
        /*流程控制:
        计算机在执行代码时，对指令代码执行顺序的控制
        1.顺序执行:代码出现的先后顺序以及语法的先后顺序
        2.分支执行:
        3.重复执行:
        */


        //可选分支：单分支结构
        System.out.println("第一步");
        System.out.println("第二步");
        /*判断：判断条件表达式的结果，如果为true,执行分支逻辑，如果为false,继续执行
        判断的语法使用if关键字，表示如果，在条件表达式前使用，如果为true，那么分支逻辑应该在后续的大括号中执行
         */
        int i = 10;
        if (i== 10){
            System.out.println("分支");
        }
        System.out.println("第三步");


        System.out.println("______________________________________");


        //必选分支：双分支结构（二选一）
        //语法上使用If...else操作，这里的else就表示其他场合

        System.out.println("第一步");
        System.out.println("第二步");
        int j = 10;
        if (j== 10){
            System.out.println("分支1");
        }else {
            System.out.println("分支2");
        }
        System.out.println("第三步");


        System.out.println("______________________________________");


        //多分支：多重判断
        //语法上使用If...else if...else操作
        System.out.println("第一步");
        System.out.println("第二步");
        int t = 30;
        if (t== 10){
            System.out.println("分支1");
        }else if(t== 20) {
            System.out.println("分支2");
        }else{
            System.out.println("分支3");
        }
        System.out.println("第三步");


        System.out.println("______________________________________");


        //特殊的分支结构
        /*语法结构：switch(数据){}       对数据进行判断，如果等于某一个分支数据的值，那么执行对应分支的逻辑代码
        如果一个分支都无法匹配，那么一个分支都不会执行，如果想要无法匹配也需要执行分支，那么可以增加default关键字
        如果执行某一个分支后，不想继续执行其他分支，那么可以使用break关键字，跳出分支结构
         */
        System.out.println("第一步");
        System.out.println("第二步");
        int d = 10;
        switch (d){
            case 10:
                 System.out.println("分支1");
                 break;
            case 20:
                System.out.println("分支2");
                break;
            case 30:
                System.out.println("分支3");
            default:
                System.out.println("其他分支");
        }
        System.out.println("第三步");

    }
}
