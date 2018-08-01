package cn.mtianyan.person;

public class PersonTest {
    public static void main(String[] args) {
        Person one = new Person();
        one.name ="李明";
        one.age = 10;
        one.grade = "五";

        one.student();
        one.sex("男");
        one.mySelf();
    }
}
