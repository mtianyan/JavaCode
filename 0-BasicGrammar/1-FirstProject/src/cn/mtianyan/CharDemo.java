package cn.mtianyan;

public class CharDemo {
    public static void main(String[] args) {
        char a = 'a';
        char b = 65;
        System.out.println("a="+a);
        System.out.println("b="+b);

        char c = 65535;
        char cOut = (char) 65536;
        System.out.println("cOut=" +cOut);
        // 定义变量存放unicode编码表示的字符
        char uc = '\u005d';
        System.out.println("u=" +uc);
    }
}
