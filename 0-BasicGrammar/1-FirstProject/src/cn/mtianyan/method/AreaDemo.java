package cn.mtianyan.method;

public class AreaDemo {
    // 求圆形面积
    public double area(double radius){
        return Math.PI*radius*radius;
    }
    // 求长方形面积
    public double area(double width,double height){
        return width*height;
    }
    public static void main(String[] args) {
        AreaDemo areaDemo = new AreaDemo();
        System.out.println("圆面积: "+areaDemo.area(2.0));
        System.out.println("长方形面积: "+areaDemo.area(3.0, 4.0));
    }
}
