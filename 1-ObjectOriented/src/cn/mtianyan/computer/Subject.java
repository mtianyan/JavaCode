package cn.mtianyan.computer;

public class Subject {
    public Subject(String name, String code, int year){
        this.setName(name);
        this.setCode(code);
        this.setYear(year);
        this.studentsNum = 0;
        this.students = new Student[100];
    }
    public void showInfo(){
        System.out.println("专业信息如下:");
        System.out.println("专业名称: " + this.name);
        System.out.println("专业编号: " + this.code);
        System.out.println("学制年限: " + this.year +"年");
        System.out.println("=====================");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private String code;
    private int year;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void addStudent(Student student){
        int stuNum = this.getStudentsNum();
        this.getStudents()[stuNum] = student;
        this.setStudentsNum(++stuNum);
    }
    public void showStudents(){
        for (int i=0;i<studentsNum;i++) {
            System.out.println(this.name+"专业学生信息: ");
            System.out.println(students[i].getName());
        }
    }

    private Student[] students;

    public int getStudentsNum() {
        return studentsNum;
    }

    public void setStudentsNum(int studentsNum) {
        this.studentsNum = studentsNum;
    }

    private int studentsNum;
}
