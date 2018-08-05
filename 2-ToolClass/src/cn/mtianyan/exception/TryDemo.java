package cn.mtianyan.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo {
    public static void main(String[] args) {
//        // 定义两个整数，输出两数之商
//        int one = 12;
//        int two = 2;
//        System.out.println("one/two="+one/two);

        // 用户输入不可控
        System.out.println("====运算开始====");
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入第一个数字: ");
            int one = scanner.nextInt();
            System.out.print("请输入第二个数字: ");
            int two = scanner.nextInt();
            System.out.println("one/two=" + one / two);
        }catch (ArithmeticException e){
            System.exit(1);
            System.out.println("除数不可以为0");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("请输入整数");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("程序出错了");
        } finally {
            System.out.println("====运算结束====");
        }

    }
}
