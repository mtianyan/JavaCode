package cn.mtianyan.singleton;

public class EmperorTest {
    public static void main(String[] args) {
        Emperor one = Emperor.getInstance();
        Emperor two = Emperor.getInstance();
        Emperor three = Emperor.getInstance();
        System.out.println("三个皇帝对象依次是: ");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
