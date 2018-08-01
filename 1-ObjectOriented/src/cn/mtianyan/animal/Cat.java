package cn.mtianyan.animal;

/**
 * 宠物猫类
 * @author mtianyan
 */
public class Cat {
    // 猫的成员属性: 昵称、年龄、体重、品种;
    String name;
    int age;
    float weight;
    String species;

    public Cat(){
        System.out.println("我是无参构造");
    }
    // 构造方法
    public Cat(String name){
        System.out.println("我是有参构造");
    }
    public Cat(String name,int age,float weight,String species){
        this("哈哈"); // 在构造方法内调用构造方法
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }
//    public void Cat(){
//        System.out.println("我只是一个普通方法，恰好方法名与类名相同了");
//    }

    // 方法:跑动、吃东西
    public void run(){
        eat();
        System.out.println("小猫在跑");
    }
    public void eat(){
        System.out.println("小猫吃鱼");
    }
    public void run(String name){
        System.out.println(name+"在跑");
    }
}
