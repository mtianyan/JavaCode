package cn.mtianyan.flow2;

public class StarDemo {
    public static void main(String[] args) {
        int i=1; // 外重循环的循环变量
        int j; // 内重循环的循环变量
        System.out.println("输出4行10列的星号");
        // 外层控制有几行，内层控制每行有几列
        while (i <= 4) {
            j=5;
            while (i <= j){
                System.out.print(" ");
                j--;
            } // 输出空白图形
            j=1;
            while (j <= i) {
                System.out.print("*");
                j++;
            } // 输出左半部分
            j=1;
            while (j < i) {
                System.out.print("*");
                j++;
            } // 输出右半部分
            System.out.println();
            i++;
        }
    }
}
