package cn.mtianyan.inherit;

public class Dog extends Animal {
    private  String sex; //性别
    public void Dog(){

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // 睡觉的方法
    public void sleep(){
        super.eat();
       //  super.temp = 10;

        System.out.println(this.getName()+"现在"+this.getMonth()+"个月大,它在睡觉");
    }
    // 睡觉方法的重载方法
    private String sleep(String name){
        return "";
    }
    // 只要两个参数的类型顺序不同
    public void sleep(String name,int month){

    }
    public void sleep(int month,String name){

    }
//    // 与方法的参数名无关
//    public void sleep(int age,String month){
//
//    }

    // 狗类中 子类重写父类吃东西方法
    public void eat(){
        System.out.println(this.getName()+"最近没有食欲");
    }
    // 狗类中 子类重写父类吃东西方法
    public void eat(String month){
        System.out.println(month+"最近没有食欲");
    }


    public void setMonth(int month) {
        super.setMonth(month);
    }

    @Override
    public Dog create() {
        return new Dog();
    }
}
