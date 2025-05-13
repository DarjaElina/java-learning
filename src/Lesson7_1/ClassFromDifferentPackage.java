package Lesson7_1;

import Lesson7.Employee;

public class ClassFromDifferentPackage {
    public static void main(String[] args) {
        Employee e1 = new Employee("John");
        e1.printName();
    }
}
