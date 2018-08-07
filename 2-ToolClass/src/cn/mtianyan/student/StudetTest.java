package cn.mtianyan.student;

import java.util.HashSet;
import java.util.Iterator;
public class StudetTest {


    public static void main(String[] args) {
        Student student1 = new Student(3,"William",65.0f);
        Student student2 = new Student(1,"Tom",87.0f);
        Student student3 = new Student(2,"Lucy",95.0f);


        HashSet<Student> hashSet = new HashSet<Student>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);

        Iterator<Student> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Student student4 = new Student(2,"Lucy",16.0f);
        hashSet.add(student4);

        System.out.println("*****************");
        Iterator<Student> iterator2 = hashSet.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next().getStuId());
//            System.out.println(iterator2.next());
        }
    }
}
