package Homework.Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    void doubleSalary() {
        salary *= 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id = 100;
        employee.surname = "Smith";
        employee.age = 25;
        employee.salary = 10000;
        employee.department = "Engineering";

        System.out.println("Employee's salary is: " + employee.salary);
        employee.doubleSalary();
        System.out.println("Employee's salary is: " + employee.salary);
    }
}
