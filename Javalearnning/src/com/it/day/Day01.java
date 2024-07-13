package com.it.day;

public class Day01 {
    public static void main(String[] args) {
        /*
        TODO  2024.7.11笔记（P1-P12）
        1.快捷键：复制当前行 ctrl+D
        2.变量：可以改变的向量存储
        ①声明 ：数据类型 变量的名称   ②赋值：变量名称=数据
         String username = "李四";
        ③使用：直接访问变量的名称即可
        System.out.println(name);
        3.标识符：标识数据的符号（主要用于起名 eg:下面的name）
                String name = "张三";
        ①命名规则：
        √  英文小写（单词） 符号（下划线 美元符号 ）  数字（0-9 不能放在开头）
        ×  空格  关键字保留字   大括号范围内，标识符不允许重复
        ※ 标识符区分大小写  驼峰标识userName

        TODO  2024.7.12笔记（P13-P23）
        1.基本数据类型
        ①数值类型
        整数类型：byte(8位) short(16位) int(32位) long(64位)
                int age = 28;
        浮点类型（小数）：float（赋值后的数字后面加F，否则会报错）   double（默认）
                float score = 59.9F;
        ②字符类型：char
               char c ='A';
        ③布尔类型：true false 判断条件是否成立
               boolean bln =true;
        2.引用数据类型
        可以被引用的数据类型
        String s = "abc";
        3.数据类型转换
        ①范围小的数据可以直接转换为范围大的数据，但是范围大的数据无法直接转换为范围小的数据（浮点类型比整数类型大）
        byte b = 10;
        short s = b;
        int i = s;
        long lon = i;
        float f =lon ;
        double d = f;
        ②强制转换（范围大的数据转换为范围小的数据，需要使用小括号进行强制转换）
        int i1 = (int)d;
        4.运算符
        参与数据运算的符号
        ①算术运算符
        二元运算符：两个元素参与运算的运算符(加减乘除取余)（最小使用的类型为int类型）
        System.out.println(1+2);//3
        System.out.println(2-2);//0
        System.out.println(3*2);//6
        System.out.println(1/2);//0 （两个元素都是int类型，结果也为int类型 结果取整）
        System.out.println(1.0/2);//0.5（1.0为double类型，2为int类型，double＞int，结果为double类型）
        System.out.println(5％2);//1（取余）
        注意：
        二元运算符的最小使用的类型为int，b1,b2为byte，
        但b1+b2为int类型，因为b3已经确定为byte类型，所有需要把b1+b2强制转换为byte类型
        byte b1 = 10;
        byte b2 = 20;
        byte b3 =(byte)(b1+b2);
        一元运算符：一个元素参与运算的运算符（自增：++就是+1   自减：--就是-1）
        ++i:先加1后赋值    i++：先赋值后加1
        --i:先减1后赋值    i--：先赋值后减1
        int i = 0;
        int j =i++;
        System.out.println(i);//1
        System.out.println(j);//0
        int i = 0;
        int j =++i;
        System.out.println(i);//1
        System.out.println(j);//1
        ②赋值运算符
        ＝  右边赋值给左边
        +=   *=
        int i = 1;
        i+=1;//先加1 再等于
        System.out.println(i);//2
        如果使用了复合赋值运算符，那么数据的类型不会发生变化
        byte b1 = 10;
        b1 +=20;
        System.out.println(b1);
        ③关系运算符
        比较两个数据之间关系的运算符（元素1（数据1，表达式1） 关系运算符  元素2（数据2，表达式2））
        关系表达式的结果为布尔类型（true false）
        ==等于   ！=不等于  ＞大于  ＞=大于等于   ＜小于   ＜=小于等于
        int i = 10;
        int j = 20;
        System.out.println(i>j);//false
        ④逻辑运算符
        用于描述多个条件表达式之间的关系的运算符
        语法结构：变量=（条件表达式1）逻辑运算符（条件表达式2）
        结果的变量的类型，条件表达式的结果类型：布尔值
        逻辑运算符：
        &：与  两个结果都为true时，最终结果为true,其他情况全是false
        int i = 10;
        boolean result = (i > 5)&(i < 20);//两个条件都满足
        System.out.println(result);//true
        |:或 只要有1个结果为true,最终结果为true
        !:非 相反运算
        int i = 10;
        boolean result = i == 10;
        System.out.println(!result);//相反运算 真变成假 假变成真
        短路运算符：
        根据第一个条件表达式的结果来判断，是否执行第二个条件表达式
        &&：短路与
        int i = 10;
        int j = 20;
        boolean result = (i > 10)&&(++j >30 );//第一个结果为false,无需执行第二个表达式
        System.out.println(result);//false
        ||：短路或
        int i = 10;
        int j = 20;
        boolean result = (i == 10)||(++j >30 );//第一个结果为true,无需执行第二个表达式
        System.out.println(result);//true
        ⑤三元运算符
        三个元素参与运算的运算符
        语法结构：变量=（条件表达式）？（任意的表达式1）：任意的表达式2）
        条件表达式的结果为true;执行表达式1
        条件表达式的结果为false;执行表达式2
        int i = 10;
        int j = 20;
        int k = (i == 10)?1+1:2+2;//结果为true，执行1+1
        System.out.println(k);//2
        5.表达式
        采用运算符和数据连接在一起形成符合Java语法规则的指令代码
                 */
    }
}