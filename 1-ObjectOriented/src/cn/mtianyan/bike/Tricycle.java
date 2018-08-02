package cn.mtianyan.bike;

public class Tricycle extends NonMotorVehicle{
    public Tricycle(int numberOfWheels){
        this.setNumberOfWheels(numberOfWheels);
    }
    public void run(){
        System.out.print("三轮车类信息测试: ");
        System.out.print("三轮车是一款有"+this.getNumberOfWheels()+"个轮子的非机动车");
    }
}
