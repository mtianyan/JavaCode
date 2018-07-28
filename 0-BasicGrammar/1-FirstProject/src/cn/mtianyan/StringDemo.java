package cn.mtianyan;

public class StringDemo {

    public static void main(String[] args) {
        // 定义一个空字符串
        String s1 = "";
        System.out.println("s1="+s1);

        String s2 = "Hello";
        System.out.println("s2="+s2);

        String s3 = "A\u005d\u005fB"; // A,B正常显示，普通与Unicode可以混在一个字符串里
        System.out.println("s3="+s3);

        String s4 = "Hello  mtianyan"; // 空格也是一个字符，字符串的长度也要算上空格。
        System.out.println("s4="+s4);
    }
}
