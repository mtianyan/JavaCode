package cn.mtianyan.flow2;

public class DoWhileDemo {
    public static void main(String[] args) {
        // 求1到5的累加和
        int n=1;
        int sum=0;
        do {
            sum +=(n*n);
            n++;
        }while (n<=5);
        System.out.println("1到5的平方和为:"+sum);
    }
}