package cn.mtianyan.flow;

public class IntCompare {
    public static void main(String[] args) {
        int x = 5,y=15;
        // 判断x和y是否相等
        if (x != y){
            if (x >y ){
                System.out.println(x+"大于"+y);
            }else{
                System.out.println(x+"小于"+y);
            }
        }else {
            System.out.println(x+"和"+y+"相等");
        }

        if (x != y)
            if (x >y )
                System.out.println(x+"大于"+y);
            else
                System.out.println(x+"和"+y+"相等"); // else语句与离它最近的进行匹配，对应到x>y这个了
    }
}
