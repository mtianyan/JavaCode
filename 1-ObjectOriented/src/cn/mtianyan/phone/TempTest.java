package cn.mtianyan.phone;

interface IA{
    int TEMP =10;
}
interface IB extends IA{
    String TEMP = "temp";
}

public class TempTest implements IA,IB{
    public static void main(String[] args) {
        IA a = new TempTest();
        IB b = new TempTest();
        System.out.print(a.TEMP);
        System.out.println(b.TEMP);
    }
}
