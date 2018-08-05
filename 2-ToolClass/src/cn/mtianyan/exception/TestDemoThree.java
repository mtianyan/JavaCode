package cn.mtianyan.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDemoThree {
    public static void main(String[] args) {


        try {
            System.out.println("one/two=" + add());
        } catch (ArithmeticException e) {
            System.out.println("除数非0");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        add();
    }

    /**
     * 两数字相加的方法
     * @return
     * @throws ArithmeticException
     * @throws InputMismatchException
     */
    public static int add() throws ArithmeticException, InputMismatchException {
        // 用户输入不可控
        System.out.println("====运算开始====");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数字: ");
        int one = scanner.nextInt();
        System.out.print("请输入第二个数字: ");
        int two = scanner.nextInt();
        System.out.println("====运算结束====");
        return one / two;
    }

//    public static int add() throws Exception {
//        // 用户输入不可控
//        System.out.println("====运算开始====");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入第一个数字: ");
//        int one = scanner.nextInt();
//        System.out.print("请输入第二个数字: ");
//        int two = scanner.nextInt();
//        System.out.println("====运算结束====");
//        return one / two;
//    }
}
