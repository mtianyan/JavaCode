package cn.mtianyan.animal;

public  class CatTest {



    public static void main(String[] args) {
        Cat oneCat = new Cat(-1);
        Cat twoCat = new Cat(3);
        System.out.println("年龄: "+ oneCat.getAge());
//        oneCat.setAge(-1);
        oneCat.setName("花花");
        oneCat.setSpecies("中华田园猫");
        oneCat.setWeight(1000);

        System.out.println(oneCat.price);
        oneCat.eat();
        Cat.eat();

        System.out.println("年龄: "+ oneCat.getAge());
        System.out.println("昵称: "+ oneCat.getName());
        System.out.println("体重: " + oneCat.getWeight());
        System.out.println("品种: " + oneCat.getSpecies());
    }
}
