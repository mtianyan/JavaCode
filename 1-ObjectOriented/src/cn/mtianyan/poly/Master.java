package cn.mtianyan.poly;

public class Master {
//    public void feed(Cat cat){
//        cat.eat();
//        cat.playBall();
//    }
//    public void feed(Dog dog){
//        dog.eat();
//        dog.sleep();
//    }
    public void feed(Animal animal){
        animal.eat();
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.sleep();
        }else if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.playBall();
        }
    }

    public Dog hasManyTime(){
        System.out.println("主人休闲时间比较充足，适合养狗狗");
        return new Dog();
    }
    public Cat hasLittleTime(){
        System.out.println("主人休闲时间比较不足,适合养猫咪");
        return new Cat();
    }

    public Animal raise(boolean isManyTime){
        if (isManyTime){
            System.out.println("主人休闲时间比较充足，适合养狗狗");
            return new Dog();
        }else {
            System.out.println("主人休闲时间比较不足,适合养猫咪");
            return new Cat();
        }
    }
}
