package cn.mtianyan.method;

public class FacDemo {
    public int fac(int n){
        int s =1;
        for (int i=1;i<=n;i++){
            s *=i;
        }
        return s;
    }
    public static void main(String[] args) {
        FacDemo facDemo = new FacDemo();
        // int fac = facDemo.fac(3);
        // System.out.println("3！= "+fac);
        // 求1! + 2! +3! +4! +5!
        int sum = 0;
        for (int i=1;i<=5;i++){
            sum +=facDemo.fac(i);
        }
        System.out.println("1!+2!+3!+4!+5! 和为： "+sum);
    }
}
