package cn.mtianyan.operator;

public class ConditionThreeEye {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int max;
        if(a>b){
            max = a;
        }else{
            max = b;
        }
        System.out.println("max:"+max);
        max = a>b?a:b;
        System.out.println("max:"+max);
        boolean result = a>b?(3<6):(true == false);
        System.out.println(result);
    }
}
