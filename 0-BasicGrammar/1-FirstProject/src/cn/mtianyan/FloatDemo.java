package cn.mtianyan;

public class FloatDemo {
    public static void main(String[] artgs){
        // 定义一个单精度浮点型变量,存放1234.328
        float f = 1234.328f; // 一个浮点型数据末尾什么都不写，是Double型的。
        System.out.println("f="+f);

        // 定义一个双精度浮点型变量，存放5623.456
        double d = 5623.465; //写d，写f后缀都是可以的，小可以变大。
        System.out.println("d="+d);

        double d1 = 123L; // Double类型范围最大
        System.out.println("d1="+d1);

        // 变量间赋值
        double d2 = d;
        System.out.println("d2="+d2);
    }
}
