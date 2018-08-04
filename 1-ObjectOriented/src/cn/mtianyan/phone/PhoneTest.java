package cn.mtianyan.phone;

public class PhoneTest {
    public static void main(String[] args) {
        FourthPhone fourthPhone = new FourthPhone();
        fourthPhone.call();
        fourthPhone.message();
        fourthPhone.music();
        fourthPhone.video();
        fourthPhone.internet();
        fourthPhone.photo();
        fourthPhone.game();

        System.out.println("============");
        Iphoto iphoto = new FourthPhone();
        iphoto.photo();
        ((FourthPhone) iphoto).game();
        iphoto = new Camera();
        iphoto.photo();

        System.out.println("---------------");
        System.out.println(INet.TEMP);

        System.out.println("===============");
        INet net = new SmartWatch();
        net.network();
        net.connection();
    }
}
