package Lesson7;

public class Employee {
    // public instance variable
    public String name;
    // private instance variable
    private double salary;
    // default instance variable
    int age;

    // public method
    public void printName() {
        System.out.println("New salary: " + salary * 2);
    }
    // private method
    private void doubleSalary() {
        System.out.println("New salary: " + salary * 2);
    }
    void printAge() {
        System.out.println("Age: " + age);
    }

    // public constructor
    public Employee(String name1) {
        name = name1;
    }
    // private constructor
    private Employee(double salary2) {
        salary = salary2;
    }
    Employee(int age2) {
        age = age2;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John");
        e1.printName();

        Employee e2 = new Employee(1000.00);
        e2.doubleSalary();

        Employee e3 = new Employee(20);
        e3.printAge();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("John");
        e1.printName();


        // Employee e2 = new Employee(300); // compiler error, private constructor
        // e2.doubleSalary(); // // compiler error, private method

        Employee e3 = new Employee(20);
        e3.printAge();
    }
}
