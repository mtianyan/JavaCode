package cn.mtianyan.inherit;

public class TestThree {
    public static void main(String[] args) {
        Animal one = new Animal("花花",10);
        Animal two = new Animal("花花",10);

        System.out.println(one.equals(two));
        System.out.println(one == two);
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        System.out.println("================");
        System.out.println(one.toString());
        System.out.println(one);
//        System.out.println(str1);
//        System.out.println(str1.toString());

    }
}
