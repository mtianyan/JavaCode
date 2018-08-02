package cn.mtianyan.computer;

public class Student {
    /**
     * 学生类的全参构造方法
     * @param name 学生姓名
     * @param studentID 学号
     * @param sex 性别
     * @param age 年龄
     * @param subject 专业
     */
    public Student(String name,String studentID, String sex,int age,Subject subject){
        this.setName(name);
        this.setStudentID(studentID);
        this.setAge(age);
        this.setSex(sex);
        this.subject = subject;
    }
    public void showInfo(){
        System.out.println("==================");
        System.out.println("姓名: "+this.getName());
        System.out.println("学号: "+studentID);
        System.out.println("性别: "+sex);
        System.out.println("年龄: "+age);
        System.out.println("所报专业名称: "+ subject.getName());
        System.out.println("学制年限: "+ subject.getYear());
    }
    private String name;

    /**
     * 获取姓名的方法
     * @return 姓名
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String studentID;
    private String sex;
    private int age;
    private Subject subject;
}

