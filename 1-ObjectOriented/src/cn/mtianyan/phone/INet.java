package cn.mtianyan.phone;

public interface INet {
    // 接口中抽象方法可以不写abstract关键字
    // 不写public，子类继承也会直接有public修饰符
    public void network();


    // 接口中可以定义常量: 默认会加上public static final
   int TEMP = 20;

    default void connection(){
        System.out.println("我是接口中的默认连接");
    };
//    void connection();

    // 静态方法: 也是可以带方法体的。
    static void stop(){
        System.out.println("我是接口中的静态方法");
    }
}
