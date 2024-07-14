package com.it.day;

public class D04 {
    public static void main(String[] args) {
        //TODO  面向对象
        //分析问题时，以问题所涉及到的事或物为中心的分析方式
        //类和对象  类（class）：表示归纳和整理  对象：表示具体的事物
        /*类的基本语法结构：（类名第一个字母大写)
        class 类名{
              特征（属性）
              功能（方法）
        }
        创建对象的语法结构：
        new 类名（）;
         */
        //1.先声明类  2.创建对象   3.声明属性（类中的变量） 4.声明方法 5.执行方法
        // 变量类型 变量名称 = 变量值
        //声明方法：  void 方法名 （参数）{功能代码}
        //执行方法：  对象.方法名（）
        Cooking c = new Cooking();
        c.name = "红烧排骨";
        c.food = "排骨";
        c.execute();

        Cooking c1 = new Cooking();
        c1.name = "水煮鱼";
        c1.food = "鲫鱼";
        c1.execute();

        }
}
class Cooking{
     String name;
     String type = "红烧";
     String food;
     String relish = "大料";
     //执行

    //声明方法：  void 方法名 （参数）{功能代码}
     void execute(){
         System.out.println("准备食材:"+food);
         System.out.println("准备佐料:"+relish);
         System.out.println("开始烹饪");
         System.out.println(name+"烹饪完成");
     }
}
