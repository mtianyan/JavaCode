package cn.mtianyan.people;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 12;

//        // 获取内部类对象实例，方式1: new 外部类.new 内部类
//        Person.Heart heart1 = new Person().new Heart();
//        System.out.println(heart1.beat());
//
//        // 获取内部类对象实例，方式2: 外部类对象.new 内部类
//        Person.Heart heart2 = person.new Heart();
//        System.out.println(heart2.beat());

//        // 获取内部类对象实例，方式3: 外部类对象.获取内部类方法(返回值为内部类对象)
//        Person.Heart heart3 = person.getHeart();
//        System.out.println(heart3.beat());
//
//        // 获取静态内部类对象实例
//        Person.Heart myStaticHeart = new Person.Heart();
//        System.out.println(myStaticHeart.beat());
//
//        System.out.println("--------------");
//        System.out.println(Person.Heart.age);
//        Person.Heart.say();

        Person person1 = new Person();
        System.out.println(person1.getHeart());
    }
}
