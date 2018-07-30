package cn.mtianyan.flow2;

public class StarDemoExercise {
    public static void main(String[] args) {
        // 输出五行
        for(int i=1;i<=5;i++){

            for (int j=4;i<=j;j--){
                System.out.print("-");
            }
            for (int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
