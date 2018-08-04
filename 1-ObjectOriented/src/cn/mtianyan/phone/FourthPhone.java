package cn.mtianyan.phone;

public class FourthPhone extends ThirdPhone implements Iphoto,INet{
    public void internet(){
        System.out.println("手机可以上网");
    }
    public void game(){
        System.out.println("手机可以玩游戏");
    }

    @Override
    public void photo() {
        System.out.println("手机可以拍照");
    }

    @Override
    public void connection() {
        System.out.println("我是四代手机中的connection");
    }

    @Override
    public void network() {

    }
}
