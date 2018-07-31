package cn.mtianyan.method;

public class DisCountDemo {
    public float money(float price){
        if (price<100){
            return price;
        }else if (price <=199){
            return price*0.95f;
        }else{
            return price*0.85f;
        }
    }
    public static void main(String[] args) {
        DisCountDemo disCountDemo = new DisCountDemo();
        float price = disCountDemo.money(150);
        System.out.println("折后商品总价为: "+price);
    }
}
