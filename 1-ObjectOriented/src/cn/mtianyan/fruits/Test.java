package cn.mtianyan.fruits;

public class Test {
    public static void main(String[] args) {
        Fruits one = new Fruits("圆","甜");
        Fruits two = new Fruits("圆","甜");
        one.eat();
        System.out.println("fru1和fru2的引用比较: "+one.equals(two));

        System.out.println("---------------------------");
        Waxberry waxberry = new Waxberry("圆形","酸甜适中","紫红色");
        waxberry.face();
        waxberry.eat();
        System.out.println(waxberry);

        System.out.println("---------------------------");
        Banana banana = new Banana("短而稍圆","果肉香甜","黄色");
        System.out.println(banana);
        System.out.println("仙人蕉颜色为"+banana.getColor());
    }
}
