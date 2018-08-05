package cn.mtianyan.exception;
import java.util.Scanner;

public class TryDemoReturn {
    public static void main(String[] args) {

        System.out.println("one/two="+add());

    }
    public static int add(){
        // 用户输入不可控
        System.out.println("====运算开始====");
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入第一个数字: ");
            int one = scanner.nextInt();
            System.out.print("请输入第二个数字: ");
            int two = scanner.nextInt();
            return one/two;
        }catch (ArithmeticException e){
            System.out.println("除数不可以为0");
            return 0;
        } finally {
            System.out.println("====运算结束====");
        }
    }
}
