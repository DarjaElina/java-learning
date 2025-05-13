package Homework.Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int newId, String newSurname, int newAge, double newSalary, String newDepartment) {
        id = newId;
        surname = newSurname;
        age = newAge;
        salary = newSalary;
        department = newDepartment;
    }

    void doubleSalary() {
        salary *= 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Smith", 25, 10000, "Engineering");

        System.out.println("Employee's salary is: " + employee.salary);
        employee.doubleSalary();
        System.out.println("Employee's salary is: " + employee.salary);
    }
}
