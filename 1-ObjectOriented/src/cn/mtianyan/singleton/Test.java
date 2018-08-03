package cn.mtianyan.singleton;

public class Test {
    public static void main(String[] args) {
        // HungryMan hungryMan = new HungryMan();
        HungryMan one = HungryMan.getInstance();
        HungryMan two = HungryMan.getInstance();

        System.out.println(one == two);
        System.out.println(one);
        System.out.println(two);

        LazyMan one1 = LazyMan.getInstance();
        LazyMan two1 = LazyMan.getInstance();

        System.out.println(one1 == two1);
        System.out.println(one1);
        System.out.println(two1);
    }
}
