package cn.mtianyan.operator;

public class MathExercise {
    public static void main(String[] args) {
        int m =10;
        int n =5;
        m +=3;
        n +=5;
        float p = (m+n)/2;
        float q = (m*m)*(n*n);
        System.out.println("m和n的平均值为:"+p);
        System.out.println("m的平方乘以n的平方为:"+q);
    }
}
