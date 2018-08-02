package cn.mtianyan.inherit;

public class Animal {
    private String name;
    private int month;
    private String species;
    public int temp =150;



    static {
        System.out.println("我是父类的静态代码块");
    }

    private static int st1=22;
    public static int st2=23;

    {
        System.out.println("我是父类的构造代码块");
    }
    public Animal(){
        System.out.println("我是父类的无参构造方法");
    }
    public Animal(String name,int month){
        System.out.println("我是父类的有参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    // 吃东西
    public void eat(){
        System.out.println(this.getName()+"在吃东西");
    }
}
