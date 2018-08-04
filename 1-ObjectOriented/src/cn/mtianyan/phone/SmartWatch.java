package cn.mtianyan.phone;

public class SmartWatch implements INet, Iphoto {
    public static final int TEMP = 30;
    @Override
    public void network() {
        System.out.println("智能手表可以上网");
    }

    @Override
    public void connection() {
        System.out.println("SmartWatch 中的connection");
    }

    @Override
    public void photo() {

    }
}
