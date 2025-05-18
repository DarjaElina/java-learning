package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double increase(double a) {
        return a * 2;
    }

    public double increaseSalary() {
        return salary *= 2;
    }
}

class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 500.00);
        double res = emp1.increase(emp1.salary);
        System.out.println(res);
        System.out.println(emp1.salary);
        emp1.increaseSalary();
        System.out.println(emp1.salary);
    }
}
