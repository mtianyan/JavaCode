package cn.mtianyan.set;

import java.util.ArrayList;

public class EmployeeTest {

    public static void main(String[] args) {
        ArrayList employeeList = new ArrayList();
        Employee employee1 = new Employee("张三",5000.0);
        Employee employee2 = new Employee("李四",5500.0);
        Employee employee3 = new Employee("赵六",4000.0);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        System.out.printf("%-10s","员工性别");
        System.out.printf("%-5s","员工薪资");
        System.out.println();
        for (Object employee:employeeList) {
            System.out.printf("%-11s",((Employee)employee).getName());
            System.out.printf("%-5s",((Employee)employee).getSalary());
            System.out.println();
        }

    }
}
