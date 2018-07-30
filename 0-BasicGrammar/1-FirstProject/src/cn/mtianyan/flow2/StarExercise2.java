package cn.mtianyan.flow2;

public class StarExercise2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int j=4;i<=j;j--){
                System.out.print("-");
            }
            for (int j=1;j<=(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
