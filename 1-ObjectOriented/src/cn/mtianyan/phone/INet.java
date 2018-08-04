package cn.mtianyan.phone;

public interface INet {
    // 接口中抽象方法可以不写abstract关键字
    // 不写public，子类继承也会直接有public修饰符
    public void network();
    void connection();

    // 接口中可以定义常量: 默认会加上public static final
   int TEMP = 20;
}
