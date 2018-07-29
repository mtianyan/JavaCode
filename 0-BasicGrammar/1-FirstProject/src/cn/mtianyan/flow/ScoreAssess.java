package cn.mtianyan.flow;

import java.util.Scanner;

public class ScoreAssess {
    public static void main(String[] args) {
        System.out.println("请输入成绩: ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if(score >=90) {
            System.out.println("优");
        }
        else if (score>=80){ // 相当于score>=80 & score<90
            System.out.println("良");
        }
        else if(score >=60){
            System.out.println("中");
        }
        else{
            System.out.println("不及格");
        }

    }
}
