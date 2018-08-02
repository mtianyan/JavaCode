package cn.mtianyan.bike;

public class ElectricBike extends NonMotorVehicle {
    public ElectricBike(String brand){
        this.setBrand(brand);
    }
    public void run(){
        System.out.print("电动车类信息测试: ");
        System.out.print("这是一辆使用");
        System.out.print(this.getBrand()+"牌电池的电动车");
    }
}
