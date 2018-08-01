package cn.mtianyan.ming;

public class Student {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getAge() {
        return age;
    }

    public  void setAge(int age) {
        Student.age = age;
    }

    public static int age;

}
