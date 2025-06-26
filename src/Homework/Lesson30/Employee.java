package Homework.Lesson30;
import java.util.function.*;
import java.util.ArrayList;

public class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class EmployeeInfo {
    public static void showInfo(Employee employee) {
        System.out.println("Name: " + employee.name + ", department: " + employee.department + ", salary: " + employee.salary);
    }

    public static void filterEmployees(ArrayList<Employee> employees, Predicate<Employee> filter) {
        for (Employee employee : employees) {
            if (filter.test(employee)) {
                showInfo(employee);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "Marketing", 5200));
        employees.add(new Employee("Brian", "Engineering", 6800));
        employees.add(new Employee("Clara", "HR", 4800));
        employees.add(new Employee("David", "Finance", 6000));
        employees.add(new Employee("Mary", "IT", 4500));

        filterEmployees(employees, e -> e.department.equals("IT") && e.salary > 2000);
        System.out.println();
        filterEmployees(employees, e -> e.name.startsWith("D") && e.salary != 4500);
        System.out.println();
        filterEmployees(employees, e -> e.department.equals(e.name));
    }
}

