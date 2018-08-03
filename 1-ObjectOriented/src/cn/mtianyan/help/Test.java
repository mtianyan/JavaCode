package cn.mtianyan.help;

public class Test {
    public static void main(String[] args) {
        Animal one = new Animal();
        one.name = "花花";
        Animal two = new Animal();
        two.name = "凡凡";
        one.help(two);
    }
}
