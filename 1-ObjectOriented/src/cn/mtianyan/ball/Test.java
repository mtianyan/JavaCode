package cn.mtianyan.ball;

public class Test {
    void playBall(Ball ball){
        ball.play();
    }
    public static void main(String[] args) {
        BallTest.Inner_m one = new BallTest().new Inner_m();
        one.play();
        BallTest ballTest = new BallTest();
        ballTest.playBall();
        Test test = new Test();
        test.playBall(new Ball() {
            @Override
            public void play() {
                System.out.println("匿名内部类:");
                System.out.println("打排球");
            }
        });
    }

}
