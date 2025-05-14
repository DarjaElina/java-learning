package Homework.Lesson7_1;

import Homework.Lesson7.Employee;

public class Test {
    public static void main(String[] args) {
        // Homework.Lesson7.Employee employee = new Employee(100, "Smith"); default constructor will not work
        Homework.Lesson7.Employee employee = new Employee(100, "Smith", 2); // public constructor works fine
        System.out.println(employee.surname); // public
        // System.out.println(employee.id); // default, will not work
        //  System.out.println(employee.salary); private, will not work

        employee.showId();
        employee.showSurname();
        employee.showSalary();
    }
}
