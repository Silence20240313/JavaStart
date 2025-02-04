package com.it.day;

public class D08 {
    public static void main(String[] args) {
        /*
        TODO  面向对象-方法参数
        使用外部数据控制方法内部实现的操作，使用的是参数语法实现，也叫方法参数
        语法：方法名（参数类型 参数名称）     方法名（参数类型1 参数名称1，参数类型2 参数名称2...）
         */

       User07 user = new User07();
        String name = "张三";
        int age = 30;
        //传递参数
        user.sayHello(name,age);

        //当方法传递多个参数时，需要注意：
        //参数个数需要匹配，参数类型需要匹配，参数顺序需要匹配
        //当参数的个数不确定，但是类型相同时，可以采用特殊的参数语法声明：可变参数
        //可变参数：语法    参数类型...参数名称
        //如果参数中还包含其他意义的参数，那么可变参数应该声明在最后
        user.test(30);
        user.test(30,"李四");
        user.test(30,"张三","王五");

    }
}
class User07{
    void sayHello(String name, int age){
        //使用参数
        System.out.println("Hello" + name + "," + age);
    }
    void test(int age,String...name){
        System.out.println(name);
    }
}