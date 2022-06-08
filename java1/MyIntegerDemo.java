package at.sjq.com.lambda.demo1;

public class MyIntegerDemo {
    public static void main(String[] args) {
        String s="94,25,46,38,26,34";
        String[] str = s.split(",");

        int sum =0;
        for (int i = 0; i < str.length; i++) {
            sum=sum+Integer.parseInt(str[i]);
        }
        System.out.println(str[1]);
    }
}
