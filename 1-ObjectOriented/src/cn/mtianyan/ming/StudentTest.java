package cn.mtianyan.ming;

public class StudentTest {
    public static void main(String[] args) {

        Student stu = new Student();
        stu.setName("小红");
        stu.setAge(13);
        Student stu1 = new Student();
        stu1.setName("小明");
        stu1.setAge(18);

        System.out.println(stu.getName()+"今年"+stu.getAge()+"岁了！");
        System.out.println(stu1.getName()+"今天"+stu.getAge()+"岁了！");
    }
}
