package cn.mtianyan.shape;

public class Circle extends Shape {
    private double PI = Math.PI;
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return PI*r*r;
    }
}
