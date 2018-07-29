package cn.mtianyan.flow;

public class IfElseDemo {
    public static void main(String[] args) {
        int x = -5;
        int y = 0;
        if(x<0){
            y=-1;
        }else if(x==0){
            y=0;
        }else{
            y=1;
        }
        System.out.println("x="+x+",y="+y);
    }
}
