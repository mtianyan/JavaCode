package cn.mtianyan.array;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i=0;i<a.length;i++){
            System.out.print("请输入第"+(i+1)+"个元素: ");
            a[i] = scanner.nextInt();

        }
        System.out.println();
        System.out.println("数组元素的内容为: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        System.out.println("使用foreach输出数组内容:");
        for (int n:a) {
            System.out.print(n+" ");
        }

        System.out.println();
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum +=a[i];
        }
        System.out.println("数组累加和为: "+sum);
    }
}
