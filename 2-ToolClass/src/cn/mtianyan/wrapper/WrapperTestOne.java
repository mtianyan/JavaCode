package cn.mtianyan.wrapper;

public class WrapperTestOne {
    public static void main(String[] args) {
        // 装箱:把基本数据类型转换成包装类
        // 1.自动装箱
        // 2. 手动装箱
        int t1 =2;
        Integer t2 =t1;

        // 手动
        Integer t3 = new Integer(t1);

        // 测试
        System.out.println("int: "+t1);
        System.out.println("Interger: "+t2);
        System.out.println("Interger2: "+t3);

        System.out.println("==============");
        // 拆箱:把包装类转换成基本数据类型
        // 1. 自动拆箱
        int t4 = t2;
        // 2. 手动拆箱
        int t5 = t3.intValue();

        // 测试
        System.out.println("Interger: "+t2);
        System.out.println("自动拆箱:"+t4);
        System.out.println("手动intValue: "+t5);

        double t6 = t2.doubleValue();
        System.out.println("手动拆箱 double: "+t6);
    }
}
