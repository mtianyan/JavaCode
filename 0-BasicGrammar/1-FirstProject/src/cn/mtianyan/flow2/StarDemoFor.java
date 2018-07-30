package cn.mtianyan.flow2;

public class StarDemoFor {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=1;i<=4;i++){
            for(j=3;i<=j;j--){
                System.out.print("-");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
