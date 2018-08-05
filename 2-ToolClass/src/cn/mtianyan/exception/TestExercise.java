package cn.mtianyan.exception;

public class TestExercise {
    public static void main(String args[]) {
        try {
            int a = 1 - 1;
            System.out.println("a = " + a);
            int b = 4 / a;
            int c[] = {1};
            c[10] = 99;
        } catch (ArithmeticException e) {
            System.out.println("除数不允许为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
        }
    }
}