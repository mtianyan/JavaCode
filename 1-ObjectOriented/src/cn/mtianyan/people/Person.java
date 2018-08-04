package cn.mtianyan.people;

// 外部类:人
public class Person{
    int age;//年龄

    public Object getHeart(){
        //内部类:心脏（方法内部类）
        class Heart{

            int temp = 12;
            public  int age = 13;
            public  void say(){
                System.out.println("hello");
            }
            public String beat(){
                // eat();  // 要搭配外部类是static修饰的eat
                new Person().eat();
                // Person.this.eat();
                return new Person().age+"岁的心脏在跳动";
            }
        }
        return new Heart().beat();
    }

    public void eat(){
        System.out.println("人会吃东西");
    }

//    //内部类:心脏（静态内部类）
//    static class Heart{
//
////        int age = 99;
//        int temp = 12;
//        public static int age = 13;
//        public static void say(){
//            System.out.println("hello");
//        }
//        public String beat(){
//            // eat();  // 要搭配外部类是static修饰的eat
//            new Person().eat();
//            // Person.this.eat();
//            return new Person().age+"岁的心脏在跳动";
//        }
//    }
}
