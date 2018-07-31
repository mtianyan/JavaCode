package cn.mtianyan.method;

public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();
        methodDemo.printStar();
        System.out.println("    欢迎来到java世界");
        methodDemo.printStar();
    }
    // 打印输出星号的方法
    public void printStar(){
        System.out.println("***********************");
    }
}
