package cn.mtianyan.flow2;

import java.util.Scanner;

public class InputZeroBreak {
    public static void main(String[] args) {
        System.out.println("请输入你需要打印的数字，输入0时退出");
        Scanner scanner = new Scanner(System.in);
        int n;
        while(true){
            n = scanner.nextInt();
            if(n==0){
                System.out.println("接收到0输入，已退出");
                break;
            }
            System.out.println("n="+n);
        }
    }
}
