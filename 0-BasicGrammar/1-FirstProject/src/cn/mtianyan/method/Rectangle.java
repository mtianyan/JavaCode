package cn.mtianyan.method;

public class Rectangle {
    // 求长方形面积方法
    public int area(){
        int length =10;
        int width = 5;
        int intArea = length * width;
        return intArea; // 返回值类型和方法定义返回类型要一致。
        // 变量名和方法名一致不报错。但是我们还是最好不要混淆。
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int result = rectangle.area();
        System.out.println("Area="+result);
    }
}
