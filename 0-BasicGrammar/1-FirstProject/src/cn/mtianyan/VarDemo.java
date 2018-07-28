package cn.mtianyan;

public class VarDemo {
    public static void main(String[] args) {
        // 定义两个整型变量
        int x=3,y=5;
        // x=3,y=5; 形式是错误的
        System.out.println("x="+x);
        System.out.println("y="+y);
        // 换行问题
        System.out.printf(x+" "+y +'\n');
        // System.out.println(); // 换行
        System.out.printf(x+"\t"+y +'\n');
        System.out.println('\t');
        System.out.println(x+'\t');
        System.out.printf(x+","+y);
        System.out.println("\n\'"+x+"\'");

        char ch = '天';
        System.out.println(ch);
        char 中文 = '涯';
        System.out.println(中文);

        double d = 1.23E5; //科学计数法1.23*10^5

        float f = 1.23e5f;

        double d1 =.2; //代表0.2

        System.out.println("d=" +d);
        System.out.println("f=" +f);
        System.out.println("d1=" +d1);



    }
}
