package cn.mtianyan.animal;

/**
 * 宠物猫类
 * @author mtianyan
 */
public class Cat {
    {
        name = "喵喵";
        price = 100;
        System.out.println("我是构造代码块1");
    }
    public static float price;
    // 猫的成员属性: 昵称、年龄、体重、品种;
    private String name;

    public String getName() {
        return "我是一只名叫"+name+"小猫";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <0){
            System.out.println("猫的年龄必须大于0");
        }else{
            this.age = age;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    private int age;
    private float weight;
    private String species;

    public Cat(){
        System.out.println("我是无参构造");
    }
    // 构造方法
    public Cat(int age){
        System.out.println("我是有参构造函数");
        this.age = age;
        }
    public Cat(String name,int age,float weight,String species){
        this(10); // 在构造方法内调用构造方法
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }
    public void run(){
//        int temp =10;
        {
            int temp = 11;
            System.out.println("我是普通代码块1");
        }
        {
            int temp = 12;
            System.out.println("我是普通代码块2");
        }
        int temp = 13;
        System.out.println("小猫在跑");
    }
    public static void eat(){
        Cat cat = new Cat();
        cat.run();
        cat.age = 10;
        price = 200;

        System.out.println("小猫吃鱼");
    }
    public void run(String name){
        System.out.println(name+"在跑");
    }
    static {
        price =1000;
        System.out.println("我是位于后面的静态代码块");
    }
}
