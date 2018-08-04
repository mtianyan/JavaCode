package cn.mtianyan.phone;

public interface ISon extends IFather,IFather2 {
    void run();

    @Override
    default void say() {

    }

    @Override
    default void connection() {

    }

    @Override
    default void fly() {

    }
}
