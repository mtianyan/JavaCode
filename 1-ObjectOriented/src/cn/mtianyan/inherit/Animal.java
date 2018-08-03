package cn.mtianyan.inherit;

public class Animal {
    private String name;
    private int month;
    private String species;
    public static final int temp; // public final static int temp

    static {
        temp = 12;
        System.out.println("我是父类的静态代码块");
    }

    private static int st1=22;
    public static int st2=23;

    {
        System.out.println("我是父类的构造代码块");
    }
    Animal(){
//        temp = 10;
        System.out.println("我是父类的无参构造方法");
    }
    public Animal(String name,int month)
    {
//        temp = 20;
        this.setName(name);
        this.setMonth(month);
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
    public  void eat(){
        final int temp; // 方法内的局部变量
        temp = 12;
        final Animal animal = new Animal("花花",10);
        animal.month = 12;
        animal.name = "哈哈";

        System.out.println(this.getName()+"在吃东西");
    }

    // 重载Object中的equals方法
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        Animal temp = (Animal) obj;
        if (this.getName().equals(temp.getName()) && (this.getMonth()==temp.getMonth())){
            return true;
        }else {
            return false;
        }
    }
    // 重载Object中的equals方法
    public boolean equals(Animal obj){
        if(obj == null){
            return false;
        }
        if (this.getName().equals(obj.getName()) && (this.getMonth()==obj.getMonth())){
            return true;
        }else {
            return false;
        }

    }
    public String toString() {
        return "昵称: " +this.getName()+";年龄: "+this.getMonth();

    }
    public Animal create(){
        return new Animal();
    }
}
