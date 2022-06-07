package com.atguigu.java1;
/*
lambda表达式的使用
1.举例；（o1，o2）->Inter.compare(o1,o2);
2.格式：
       ->；lambda 操作符 或 箭头操作符
       ->:左边：lambda形参列表 （其实就是接口中的抽象方法的形参列表）
       ->:右边：lambda体 （重写方法的抽象方法的方法体）
3.lambda表达式的使用；（分6种情况介绍）

总结->左边；lambda形参列表的参数类型可以省略，如果lambda形参列表只有一个参数，（）也可以省略，
右边；lambda体，如果只有一条执行语句（可能是return语句），省略{}和return。。
 */

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest1 {
    //语法格式一：无参，无返回值
    @Test
    public void Test1(){
        Runnable r1= new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京！！！");
            }
        };
        r1.run();
        System.out.println("****************");
        Runnable r2=() -> {
            System.out.println("爱北京");
        };

        r2.run();

    }

    //格式二：需要一个参数，但是没有返回值
    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么");
        System.out.println("*****************");

        Consumer<String> con1=(String s) ->
            System.out.println(s);

        con1.accept("一个说的人当真，一个听的人当真了");
    }
    //类型三；数据类型可以省略，可以由编译器推断出
    @Test
    public void test3(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么");
        System.out.println("*****************");

        Consumer<String> con1=(s) ->
                System.out.println(s);

        con1.accept("一个说的人当真，一个听的人当真了");

    }

    //类型四 若只有一个参数，小（）可以省略
    @Test
    public void test4(){
        Consumer<String> con2 = s -> {
            System.out.println(s);
        };
        con2.accept("我爱秀秀");
    }
    //五，两个以上的参数，有返回值
    @Test
    public void test5(){
        Comparator<Double> com1 =new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(21d, 22d));
        System.out.println("*****************");

        Comparator<Double> com2 = (o1, o2) ->{
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        } ;
        System.out.println(com2.compare(29d, 27d));
    }
    //六 lambda体之内只有一个语句的时候，return与大括号若有，都可以省略
    @Test
    public void test6(){
        Comparator<Integer> com1=(o1, o2) -> o1.compareTo(o2);
        System.out.println(com1.compare(22, 24));
    }


}
