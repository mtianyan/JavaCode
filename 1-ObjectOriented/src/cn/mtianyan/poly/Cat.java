package cn.mtianyan.poly;

public class Cat extends Animal{
    private double weight;

    public void run(){
        System.out.println("小猫快乐的奔跑");
    }

    public Cat(String name, int month, double weight) {
        super(name, month);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Cat() {

    }

    @Override
    public void eat() {
//        say();
        System.out.println("猫吃鱼~~~");
    }

    public static void say(){
        System.out.println("小猫碰胡须");
    }

    public void playBall() {
        System.out.println("玩线球");
    }
}
