package com.it.day;

public class D04Test {
    public static void main(String[] args) {
        //TODO 面向对象
        //类:动物
        //对象：猫 狗
        Animal a1 = new Animal();
        a1.type = "猫";
        a1.name= "小黑";
        a1.run();
        Animal a2 = new Animal();
        a2.type ="狗";
        a2.name="大黄";
        a2.run();
    }
}
class Animal{
   String type;
   String name;
   void run(){
       System.out.println(type+" "+name +"跑开了");
   }
}