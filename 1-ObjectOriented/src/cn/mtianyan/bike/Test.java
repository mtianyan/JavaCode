package cn.mtianyan.bike;

public class Test {
    public static void main(String[] args) {
        NonMotorVehicle nonMotorVehicle = new NonMotorVehicle("天宇","红",4,2);
        nonMotorVehicle.run();
        System.out.println();
        Bike bike = new Bike("捷安特","黄");
        bike.run();
        System.out.println();
        ElectricBike electricBike = new ElectricBike("飞鸽");
        electricBike.run();
        System.out.println();
        Tricycle tricycle = new Tricycle(3);
        tricycle.run();
    }

}
