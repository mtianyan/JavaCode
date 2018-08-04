package cn.mtianyan.anonymous;

public class Test {
    // 根据传入的不同的人的类型，调用对应的read方法

    // 方案1:
//    public void getRead(Man man){
//        man.read();
//    }
//    public void getRead(Women women){
//        women.read();
//    }

    // 方案2:
    public void getRead(Person person){
        person.read();
    }


    public static void main(String[] args) {
//        Test test = new Test();
//        Man one = new Man();
//        Women two = new Women();
//
//        test.getRead(one);
//        test.getRead(two);
        Test test = new Test();
        test.getRead(new  Person() {
//            public static int age = 12;
            @Override
            public void read() {
                System.out.println("男生喜欢看科幻类书籍");
            }
        });

    }
}

