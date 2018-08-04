package cn.mtianyan.poly;

public class Dog extends Animal{
    private String sex;

    public void sleep(){
        System.out.println("小狗有午睡习惯");
    }

    public Dog() {
    }

    public Dog(String name, int month, String sex) {

        super(name, month);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void eat() {
        System.out.println("狗爱吃肉~~~");
    }
}
