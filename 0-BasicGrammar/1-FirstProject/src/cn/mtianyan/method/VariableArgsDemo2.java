package cn.mtianyan.method;

/**
 * 关于可变参数列表和重载问题
 * @author mtianyan
 * @version 0.1
 */

public class VariableArgsDemo2 {
    public int add(int a,int b){
        System.out.println("不带可变参数的方法被调用");
        return a+b;
    }
    public int add(int... a){
        System.out.println("带可变参数的方法被调用");
        int sum =0;
        for (int n:a) {
            sum +=n;
        }
        return sum;
    }
    public static void main(String[] args) {
        VariableArgsDemo2 variableArgsDemo2 = new VariableArgsDemo2();
        System.out.println(variableArgsDemo2.add(1, 2));
        System.out.println(variableArgsDemo2.add(1, 2, 3));
    }
}
