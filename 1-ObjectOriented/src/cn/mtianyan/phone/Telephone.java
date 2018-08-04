package cn.mtianyan.phone;

/**
 * 原始手机
 */
public class Telephone {
    private String brand;
    private int price;

    public Telephone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void call(){
        System.out.println("手机可以打电话");
    }
}
