package cn.mtianyan.flow2;

public class ForDemo1 {
    public static void main(String[] args) {
        int i=0;
        for (;;){
            System.out.print(i+" ");
            // 循环结束时i值为11
            if(i>=10){
                break;
            }
            i++;
        }
    }
}
