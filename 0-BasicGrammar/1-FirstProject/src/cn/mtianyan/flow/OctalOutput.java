package cn.mtianyan.flow;

public class OctalOutput {
    public static void main(String[] args) {
        //定义一一个整型变量n ,值为123
        int n;
        n = 123;
        System.out.println("n=" + n);
        //定义一个整型变量,存放八进制数
        int octal = 037;
        System.out.println("octal=" + octal); // 输出结果为十进制
        System.out.println("octal=" + Integer.toOctalString(octal)); // 输出结果为八进制对应字符串
    }
}
