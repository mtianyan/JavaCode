package cn.mtianyan.fruits;

public class Waxberry extends Fruits {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Waxberry(String shape, String taste) {
        super(shape, taste);
    }

    public void face(){
        System.out.println("杨梅: "+getColor()+"、"+getShape()+",果味"+getTaste());
    }

    @Override
    public void eat() {
        System.out.println("杨梅"+getTaste()+"，非常好吃！");
    }

    public Waxberry(String shape, String taste, String color) {
        super(shape, taste);
        this.color = color;
    }

    @Override
    public String toString() {
        return "杨梅的信息: 果实为"+getShape()+"、"+getColor()+","+getTaste()+",非常好吃！";
    }
}
