package cn.mtianyan.singleton;

public class Earth {
    private Earth() {
    }

    private static Earth instance = new Earth();

    public static Earth getInstance() {
        return instance;
    }
}
