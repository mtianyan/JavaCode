package cn.mtianyan.poly;

public class MasterTest {
    public static void main(String[] args) {
        Master master = new Master();
        Cat cat = new Cat();
        Dog dog = new Dog();
        master.feed(cat);
        master.feed(dog);
        System.out.println("===============");
        boolean isManyTime = true;
        Animal temp;
        if (isManyTime){
            temp = master.hasManyTime();
        }else {
            temp = master.hasLittleTime();
        }
        System.out.println(temp);

        System.out.println("-------------------");
        isManyTime = false;
        temp = master.raise(isManyTime);
        System.out.println(temp);
    }
}
