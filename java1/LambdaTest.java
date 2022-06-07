
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;

public class LambdaTest {

    @Test
    public void test1(){
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();
        System.out.println("********************");

        Runnable r2=() ->
                System.out.println("我爱天安门");


        r2.run();
    }

    @Test
    public void teest2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }

        };
        int compare1=com1.compare(21,25);
        System.out.println(compare1);
        System.out.println("************************");
        //lambda表达式的写法

        Comparator<Integer> com2 = (o1,o2) ->Integer.compare(o1,o2);
        int compare2=com1.compare(26,25);
        System.out.println(compare2);
        System.out.println("*******************");
        //方法引用
        Comparator<Integer> com3= Integer::compare;
        int compare3=com1.compare(25,25);
        System.out.println(compare3);
        };



    }




