package com.atguigu.java1;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
java内置的四大核心函数式接口
消费型接口 Consumer<T>   void accept(T t)
供给型接口 Supplier<T>   T get()
函数型接口 Function <T,R> R apply(T t)
断定型接口 Predicate<T >    boolean test (T t)
 */
public class lambdaTest2 {
    @Test
    public void test1(){
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("学习学习  "+aDouble);

            }
        });
        System.out.println("**********************");
        happyTime(4000,money->System.out.println("学习学习  "+money));



    }
    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }

    /////////////////////////////////////////////////////////////

    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京","天津","南京");
        List<String> filterStrs = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterStrs);

        List<String> filterStrs1 =filterString(list,s -> s.contains("北"));
        System.out.println(filterStrs1);

    }
    public List<String> filterString(List<String>list, Predicate<String> pre){
        ArrayList<String> filterList = new ArrayList<>();
        for (String s :list){
            if (pre.test(s)){
                filterList.add(s);
            }
        }
        return filterList;
    }

}
