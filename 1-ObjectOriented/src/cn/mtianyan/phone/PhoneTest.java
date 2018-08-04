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
//        System.out.println(net.TEMP);
        net.connection();
        INet.stop();

        System.out.println("***************");
        SmartWatch smartWatch = new SmartWatch();
        System.out.println(smartWatch.TEMP);

        System.out.println("----------------");
        INet net2 = new SmartWatch();
        net2.connection();

        Iphoto ip2 = new SmartWatch();
        ip2.connection();

        System.out.println("...............");
        INet net3 = new FourthPhone();
        net3.connection();

        Iphoto ip3 = new FourthPhone();
        ip3.connection();
    }
}
