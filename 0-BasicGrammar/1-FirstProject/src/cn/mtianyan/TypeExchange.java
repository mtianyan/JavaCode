package cn.mtianyan;

public class TypeExchange {
    public static void main(String[] args) {
        // char类型和int类型之间的转换
        char c = (char) 65536;
        int n;
        n = c; // 隐式类型转换
        c = (char) n;

        // 整型和浮点型转换
        int x =100;
        long y = x;
        x = (int)y;
        float f = 1000000000000000L;
        System.out.println("f="+f);
        float f1 = 102312392189367L;
        System.out.println("f1="+f1); // 会发生数据丢失
    }
}
