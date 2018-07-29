package cn.mtianyan.operator;

public class ConditionDemo1 {
    public static void main(String[] args) {
        double price1,price2;
        price1= 80;
        price2= 55;
        // 计算两件商品的总价格
        double sum= price1 + price2;
        System.out.println("原价为:"+sum);
        if (sum >100) {
            sum -=20; // sum=sum-20;
        }
        System.out.println("折后价格为:"+sum);
    }
}
