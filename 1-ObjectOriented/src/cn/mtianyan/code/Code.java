package cn.mtianyan.code;

public class Code {
    {
        System.out.println("Code的构造块");
    }
    public Code(){
        System.out.println("Code的构造方法");
    }
    static {
        System.out.println("Code的静态代码块");
    }
}
