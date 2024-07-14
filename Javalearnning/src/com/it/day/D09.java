package com.it.day;

public class D09 {
    public static void main(String[] args) {
        //TODO  面向对象
        //java中方法参数的传递为值传递    基本数据类型：数值   引用数据类型：引用地址
        //String s = "abc";
        //test(s);
        //System.out.println(s);

        // 基本类型参数传递： 传入的参数被改变的话，不影响原来的变量的值
        int i = 10;
        test1(i);
        System.out.println("最终的值： " + i);

        System.out.println("-----------------------");


//        User user = new User();
//        user.name = "张三";
//        test2(user);
//        System.out.println(user.name);



    }
    public static void test1(int i) {
        System.out.println("改变之前的值: " + i);
        i = i + 10;
        System.out.println("改变之后的值: " + i);
    }

    public static void test2(User user) {
       user.name = "李四" ;
    }
}
class User{
    String name;
}