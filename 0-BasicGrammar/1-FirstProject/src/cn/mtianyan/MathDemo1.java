package cn.mtianyan;

public class MathDemo1 {

    public static void main(String[] args) {

        // x++
        int x =4;
        int y=(x++)+5;

        System.out.println("x=" +x);
        System.out.println("y=" +y);

        // ++x
        x = 4;
        y = (++x)+5;
        System.out.println("x=" +x);
        System.out.println("y=" +y);

        // x--
        x = 4;
        y =(x--)+5;
        System.out.println("x=" +x+",y="+y);

        // --x
        x = 4;
        y = (--x)+5;
        System.out.println("x=" +x+",y="+y);
    }
}
