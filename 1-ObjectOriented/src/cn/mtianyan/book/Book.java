package cn.mtianyan.book;
import cn.mtianyan.animal.*;

public class Book {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPulishingHouse() {
        return pulishingHouse;
    }

    public void setPulishingHouse(String pulishingHouse) {
        this.pulishingHouse = pulishingHouse;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price < 10){
            System.out.println("图书价格最低10元");
            this.price =10;
        }else{
            this.price = price;
        }
    }

    private String title;
    private String author;
    private String pulishingHouse;
    private float price;

    public Book(String title,String author,String pulishingHouse,float price){
        this.setTitle(title);
        this.setAuthor(author);
        this.setPulishingHouse(pulishingHouse);
        this.setPrice(price);
    }
    public void info(){
        System.out.println("书名: " + this.getTitle());
        System.out.println("作者: " + this.getAuthor());
        System.out.println("出版社: " + this.getPulishingHouse());
        System.out.println("价格: " + this.getPrice());
    }
}
