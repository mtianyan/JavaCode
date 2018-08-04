package cn.mtianyan.ball;

public class BallTest {
    void playBall(){
        class Inner_f implements Ball{

            @Override
            public void play() {
                System.out.println("方法内部类：");
                System.out.println("打乒乓球");
                System.out.println("**********");
            }
        }
        new Inner_f().play();
    }
    // 成员内部类
    class Inner_m implements Ball {

        @Override
        public void play() {
            System.out.println("成员内部类:");
            System.out.println("打篮球");
            System.out.println("**********");
        }
    }
}
