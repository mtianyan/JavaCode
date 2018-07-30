package cn.mtianyan.flow2;

public class CharDemo {
    public static void main(String[] args) {
        // 循环输出26个英文小写字母，分两行输出
        char ch = 'a';
        int count=1; // 13个字母时换行
        while (ch <= 'z'){
            System.out.print(ch+"");
            if(count%13 == 0){
                System.out.println();
            }
            count++;
            ch++;
        }
    }
}