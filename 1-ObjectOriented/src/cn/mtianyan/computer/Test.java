package cn.mtianyan.computer;

public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject("计算机科学与应用","J0001",4);
        subject.showInfo();
        Student student1 = new Student("张三","S01","男",18, subject);
        student1.showInfo();
        Student student2 = new Student("李四","S02","女",17, subject);
        student2.showInfo();
        Student student3 = new Student("王五","S03","男",18, subject);
        student3.showInfo();
        System.out.println("----------");
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        subject.showStudents();
        System.out.println("----------");
        System.out.println("已有"+subject.getStudentsNum()+"人报名！");

    }
}
