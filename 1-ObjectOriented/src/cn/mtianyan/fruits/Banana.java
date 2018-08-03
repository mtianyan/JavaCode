package cn.mtianyan.fruits;

public class Banana extends Fruits{
    private String color;

    public Banana(String shape, String taste, String color) {
        super(shape, taste);
        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "仙人蕉果形"+getShape()+","+getTaste()+"可供生食。";
    }
}
