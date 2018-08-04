package cn.mtianyan.phone;

public class SmartWatch implements INet{

    @Override
    public void network() {
        System.out.println("智能手表可以上网");
    }

    @Override
    public void connection() {
        System.out.println("智能手表可以连接");
    }
}
