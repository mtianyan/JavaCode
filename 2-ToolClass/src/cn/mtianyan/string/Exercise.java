package cn.mtianyan.string;

public class Exercise {
    public static void main(String[] args) {
        String one = new String("abcdefg");
        String two = one.substring(2,5).toUpperCase();
        System.out.println(two);
        two =two.substring(0,1)+"MM";
        System.out.println(two);
    }
}
