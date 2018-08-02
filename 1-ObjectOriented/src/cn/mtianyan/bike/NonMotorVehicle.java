package cn.mtianyan.bike;

/**
 * 非机动车
 */
public class NonMotorVehicle {
    private String brand;
    private String color;
    private int numberOfWheels = 2;
    private int seatNumber = 1;

    public NonMotorVehicle(String brand, String color, int numberOfWheels, int seatNumber) {
        this.brand = brand;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.seatNumber = seatNumber;
    }

    public NonMotorVehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public NonMotorVehicle() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    public void run(){
        System.out.print("父类信息测试: ");
        System.out.print("这是一辆"+this.getColor()+"颜色的,");
        System.out.print(this.getBrand()+"牌的非机动车,有");
        System.out.printf(this.getNumberOfWheels()+"个轮子,"+"有"+getSeatNumber()+"个座椅");
    }
}
