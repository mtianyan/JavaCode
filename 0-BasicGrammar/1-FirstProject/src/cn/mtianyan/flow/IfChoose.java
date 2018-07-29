package cn.mtianyan.flow;

public class IfChoose {
    public static void main(String[] args) {

        int a = 5, b = 4, c = 3, d = 2;
        if (a > b && b > c) {
            System.out.println(d);
        } else if ((c - 1 >= d) == true) {
            System.out.println(d + 1);
        } else {
            System.out.println(d + 2);
        }
    }
}