package cn.mtianyan.operator;

import java.util.Scanner;

public class LeapYearDemo {
    public static void main(String[] args) {
        System.out.println("请输入年份:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year%400==0 | (year%4==0 & year%100!=0)){
            System.out.println(year+"年是闰年");
        }else {
            System.out.println(year+"年不是闰年");
        }
    }
}
