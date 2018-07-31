package cn.mtianyan.method;

public class MathDemo {
    // 求两个int类型数的和
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public double add(double[] arr1,double[] arr2){
        double arr1Sum=0,arr2Sum=0;
        for (double m:arr1) {
            arr1Sum +=m;
        }
        for (double n:arr2) {
            arr2Sum +=n;
        }
        return arr1Sum+arr2Sum;
    }
    public static void main(String[] args) {
        MathDemo mathDemo = new MathDemo();
        System.out.println("1加2的和为: "+mathDemo.add(1, 2));
        System.out.println("1.23+2.34的和为: "+mathDemo.add(1.23, 2.34));
        double[] arr1 = {1.2,1.3,1.4,1.5};
        double[] arr2 = {2.8,2.7,2.6,2.5};
        System.out.println("arr1+arr2= "+mathDemo.add(arr1, arr2));
    }
}
