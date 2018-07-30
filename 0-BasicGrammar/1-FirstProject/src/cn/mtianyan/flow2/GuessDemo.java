package cn.mtianyan.flow2;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        // 设置要猜的数
        int number = 6;
        int guess;
        System.out.println("猜一个介于1到10之间的数");
        do {
            System.out.println("请输入您猜测的数:");
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            if(guess >number){
                System.out.println("您猜大了");
            }else{
                System.out.println("您猜小了");
            }
        }while (number != guess);
        System.out.println("您猜中了!答案为: "+number);
    }
}