package cn.mtianyan.method;

public class ExchangeDemo {
    public void swap(int a,int b){
        int temp= 0;
        System.out.println("交换前: a="+a+" b="+b);
        temp = a;a = b;b = temp;
        System.out.println("交换后: a="+a+" b="+b);
    }
    public void swapTest(){
        int m =5,n=3;
        swap(m,n);
        System.out.println("main中的m: "+m);
        System.out.println("main中的n: "+n);
    }
    public static void main(String[] args) {
        ExchangeDemo exchangeDemo = new ExchangeDemo();
        // exchangeDemo.swap(m,n);
        exchangeDemo.swapTest();
    }
}
