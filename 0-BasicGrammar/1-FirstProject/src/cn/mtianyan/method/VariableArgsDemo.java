package cn.mtianyan.method;

public class VariableArgsDemo {
    // 求和(可变)
    public void sum(int... n){
        int sum =0;
        for (int i:n) {
            sum +=i;
        }
        System.out.println("sum:"+sum);
    }
    public static void main(String[] args) {
        VariableArgsDemo variableArgsDemo = new VariableArgsDemo();
        variableArgsDemo.sum(1,2,3);
        variableArgsDemo.sum(3,4,5,10);
    }
}
