package cn.mtianyan.help;

public class Animal {
    public String name;
    public int month;

    public Animal() {
    }
    public void eat(){
        System.out.println(this.name+"在吃东西");
    }
    public void help(final Animal temp){
//        temp = new Animal(); // 出错
        temp.name = "牛牛";
        temp.eat();
    }
}

