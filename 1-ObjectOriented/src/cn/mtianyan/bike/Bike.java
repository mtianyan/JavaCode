package cn.mtianyan.bike;

public class Bike extends NonMotorVehicle {
    public Bike(String brand, String color) {
        super(brand, color);
    }

    public void run(){
        System.out.print("自行车类测试: ");
        System.out.print("这是一辆"+this.getColor()+"颜色的,");
        System.out.print(this.getBrand()+"牌的自行车");
    }
}
