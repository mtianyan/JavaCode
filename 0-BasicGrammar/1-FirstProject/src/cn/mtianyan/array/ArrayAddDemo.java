package cn.mtianyan.array;

import java.util.Scanner;

public class ArrayAddDemo {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        System.out.println("请输入五个数组的元素,输入0为计算前面几个输入值，只输入0退出程序:");
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        while (true) {
            sum = 0;
            for (int i = 0; i < 5; i++) {
                intArray[i] = scanner.nextInt();
                if (intArray[i] == 0) break;
                sum = sum + intArray[i];
            }
            if (sum==0) break;
            System.out.println("sum:" + sum);
        }
    }
}
