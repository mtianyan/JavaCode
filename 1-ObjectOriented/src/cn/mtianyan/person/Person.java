package cn.mtianyan.person;

public class Person {
    String name;
    int age;
    String grade;

    public void student(){
        System.out.println("我是一名学生!");
    }

    public void sex(String sex){
        System.out.println("我是一个"+sex+"孩！");
    }
    public void mySelf(){
        System.out.print("我叫"+name+",");
        System.out.printf("今年"+age+"岁了,");
        System.out.printf("读小学"+grade+"年级了。");
    }
}
