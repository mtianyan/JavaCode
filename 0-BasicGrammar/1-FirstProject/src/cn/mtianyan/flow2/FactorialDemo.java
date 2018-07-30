package cn.mtianyan.flow2;

import java.math.BigInteger;

public class FactorialDemo {
    public static void main(String[] args) {
        BigInteger sum = new BigInteger("1");
        BigInteger s;
        for (int i=1;i<=50;i++){
            s = new BigInteger("1"); // s值每个循环内重新置1
            for (int j=1;j<=i;j++){
                BigInteger num = new BigInteger(String.valueOf(j));
                s = s.multiply(num);
            }
            sum = sum.add(s);
        }
        System.out.println("1!+2!+3!+50!="+sum);
    }
}
