package com.it.day;

public class Day04Test2 {
    public static void main(String[] args) {
        //面向对象

        Teacher t = new Teacher();
        t.name = "张三";
        t.teach();
        Student s = new Student();
        s.name = "李四";
        s.study();
    }
}
class Teacher{
    String name;
    void teach(){
        System.out.println(name + "老师在讲课");

    }
}
class Student{
    String name;
    void study(){
        System.out.println("学生"+ name + "在听课");

    }
}