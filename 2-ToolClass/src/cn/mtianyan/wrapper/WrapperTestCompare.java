package cn.mtianyan.wrapper;

public class WrapperTestCompare {
    public static void main(String[] args) {
        Integer one = Integer.valueOf(100);
        Integer two = Integer.valueOf(100);

        System.out.println("valueOf创建的one==two 的结果: "+(one==two));

        Integer one1 = new Integer(100);
        Integer two1 = new Integer(100);
        System.out.println("Integer创建的one==two 的结果: "+(one1==two1));

        one = 13;
        System.out.println(one);
        System.out.println(two);

        Integer three = 100;
        System.out.println("three==100的结果: "+(three==100)); // 自动拆箱


        Integer four = 100; // 自动拆箱操作等价于 Integer.valueOf(100);
        // 为了提高这个方法的效率，提供了一个缓存区(对象池)
        System.out.println("three==four的结果: "+(three==four));

        Integer five = 200;
        System.out.println("five==200的结果: "+(five==200));

        Integer six = 200;
        System.out.println("six==five的结果: "+(six==five));

        Double d1 = Double.valueOf(100);
        System.out.println("d1==100: "+(d1==100));

        Double d2 = Double.valueOf(100);
        System.out.println("d1==d2: "+(d1==d2));
    }
}
