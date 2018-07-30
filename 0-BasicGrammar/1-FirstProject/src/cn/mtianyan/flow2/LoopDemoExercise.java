package cn.mtianyan.flow2;

public class LoopDemoExercise {
    public static void main(String[] args) {
        for (int i=200;i<=300;i++){
            // 个位 十位 百位
            int hundreds = i / 100;
            int ten = (i-hundreds*100)/ 10;
            int single = i-hundreds*100-ten*10;

            if(hundreds*ten*single == 42 && (hundreds+ten+single)==12){
                System.out.println(i);
            }
        }
    }
}
