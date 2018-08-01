package cn.mtianyan.book;

public class BookTest {
    public static void main(String[] args) {
        Book one = new Book("红楼梦","曹雪芹","人民文学出版社",6);
        Book two = new Book("小李飞刀","古龙","中国长安出版社",55.5f);
        one.info();
        System.out.println("===================");
        two.info();
        cn.mtianyan.animal.Cat cat = new cn.mtianyan.animal.Cat();
    }
}
