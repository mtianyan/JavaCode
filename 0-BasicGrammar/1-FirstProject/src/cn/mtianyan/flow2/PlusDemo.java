package cn.mtianyan.flow2;

public class PlusDemo {
    public static void main(String[] args) {
        // 求1到5的累加和
        // 1+2+3+4+5
        int n = 1;
        int sum = 0; //sum存放和变量
        while (n <=5 ){
            sum = sum +n;
            n++; // 这句不能少
        }
        System.out.println("sum="+sum);
    }
}