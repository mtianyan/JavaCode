package cn.mtianyan.method;

public class MaxDemo {
    public void max(float a,float b){
        float max=0;
        if(a>b){
            max = a;
        }else if(a == b){
            max = a;
            System.out.print("相等:");
        }else{
            max = b;
        }
        System.out.println("两个数"+a+"和"+b+"的最大值为: "+ max);
    }
    public static void main(String[] args) {
        MaxDemo maxDemo = new MaxDemo();
        maxDemo.max(5,3);
        maxDemo.max(5,5);
        maxDemo.max(3,5);
        float m =5.6f,n=8.9f;
        maxDemo.max(m,n);
    }
}
