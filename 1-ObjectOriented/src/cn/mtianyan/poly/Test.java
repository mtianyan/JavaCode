package cn.mtianyan.poly;

public class Test {
    public static void main(String[] args) {
        Animal one = new Animal();
        Animal two = new Cat();
        Animal three = new Dog();

        one.eat();
        two.eat();
        three.eat();

        System.out.println("============");
        if (two instanceof Cat){
            Cat temp = (Cat) two;
            temp.eat();
            temp.run();
            temp.getMonth();
            System.out.println("two 可以转换为Cat类型");
        }
        if (two instanceof Dog){
            Dog temp2 = (Dog) two;
            temp2.eat();
            System.out.println("two 可以转换为Dog类型");
        }else {
            System.out.println("two 不能转换为Dog类型");
        }

        if(two instanceof Animal){
            System.out.println("Animal");
        }
        if (two instanceof Object){
            System.out.println("Object");
        }

    }
}
