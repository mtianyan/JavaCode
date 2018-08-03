package cn.mtianyan.singleton;

// 饿汉式:创建对象实例的时候直接初始化,饿的时候都比较着急
public class HungryMan {
    // 1. 创建私有构造方法
    private HungryMan(){

    }

    // 2. 创建该类型的私有静态实例
    private static HungryMan instance = new HungryMan();
    // 饿汉模式: 创建静态实例的时候直接进行实例化。

    // 3. 创建公有静态方法返回静态化实例对象
    public static HungryMan getInstance() {
        return instance;
    }
}
