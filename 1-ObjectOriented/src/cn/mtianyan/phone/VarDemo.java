package cn.mtianyan.phone;

interface One{
    static int x=11;
}
interface Two{
    final int x=22;
}
class Three{
    public static int x=33;
}
public class VarDemo extends Three implements One,Two{
    public int x=44;
    public void test(){
//        System.out.println(x); //报错
        System.out.println(One.x);
        System.out.println(Two.x);
        // System.out.println(x); // 继承three依然报错
        System.out.println(Three.x);
        System.out.println(x);
    }
    public static void main(String[] args) {
        new VarDemo().test();
    }
}
