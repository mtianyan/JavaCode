package cn.mtianyan.phone;

public class Computer implements INet {
    @Override
    public void network() {
        System.out.println("电脑可以上网");
    }
}
