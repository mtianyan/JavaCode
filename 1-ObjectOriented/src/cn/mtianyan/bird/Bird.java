package cn.mtianyan.bird;

public class Bird implements IFly {
    @Override
    public void fly() {
        System.out.println("小鸟在天空翱翔");
    }
}
