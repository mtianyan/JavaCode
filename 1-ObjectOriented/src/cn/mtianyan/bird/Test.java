package cn.mtianyan.bird;

public class Test {
    public static void main(String[] args) {
        IFly plane = new Plane();
        plane.fly();
        IFly bird = new Bird();
        bird.fly();
        Balloon balloon = new Balloon();
        balloon.fly();

    }
}
