package cn.mtianyan.phone;

public class FourthPhone extends ThirdPhone implements Iphoto{
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
}
