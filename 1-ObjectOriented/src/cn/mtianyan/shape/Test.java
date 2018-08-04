package cn.mtianyan.shape;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println("圆的面积为 "+circle.area());
        Rectangle rectangle = new Rectangle(6,5);
        System.out.println("矩形的面积为 " + rectangle.area());
    }
}
