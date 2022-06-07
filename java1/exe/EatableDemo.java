package at.sjq.com.lambda.exe;
/*
Lambda表达式的格式 (新式参数)->{代码块}

练习1.定义一个接口,里面定义一个抽象方法,
定义一个测试类,提供两个方法
          一个是:ueeEatable
          一个是主方法
 */

public class EatableDemo {
    public static void main(String[] args) {
        ueeEatable(()->{
            System.out.println("hhhhhh");
        });
    }
    public static void ueeEatable(Eatable e){
        e.eat();
    }
}
