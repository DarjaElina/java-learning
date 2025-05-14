package Homework.Lesson7;

public class Employee {
    private double salary;
    public String surname;
    int id;

    public void showSalary() {
        System.out.println(salary);
    }

    public void showId() {
        System.out.println(id);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public Employee(double salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    Employee(double salary, String surname) {
        this.salary = salary;
        this.surname = surname;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(100.00); // private constructor is accessible within class
        System.out.println(employee1.salary); // // private instance variable is accessible within class
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100.00, "Doe");
        Employee emp2 = new Employee(200.00, "Smith", 1);
        // Employee emp3 = new Employee(300); private constructor is not accessible

        emp1.showSalary();
        // System.out.println(emp1.salary); private instance variable is not accessible

        emp1.showId();
        emp1.showSurname();
    }
}
