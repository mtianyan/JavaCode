package cn.mtianyan.student;

import java.util.Objects;

public class Student {
    private int stuId;
    private String name;
    private float score;

    public Student(int stuId, String name, float score) {
        this.stuId = stuId;
        this.name = name;
        this.score = score;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "[" +
                "学号:" + stuId +
                ", 姓名: " + name + '\'' +
                ", 成绩: " + score +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 直接是一个对象，必然一样。
        if (!(o instanceof Student)) return false; // 如果传入的不是学生类的对象，那么必然不是
        Student student = (Student) o; // 将Object转换为Student
        // 学号 & 姓名 是否相等
        return getStuId() == student.getStuId() &&
//                Float.compare(student.getScore(), getScore()) == 0 &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStuId(), getName());
    }
}
