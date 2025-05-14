package Homework.Lesson7;

public class Test {
    public static void main(String[] args) {
        Homework.Lesson7.Employee employee = new Employee(100, "Smith");
        System.out.println(employee.surname); // public
        System.out.println(employee.id); // default
       //  System.out.println(employee.salary); private, will not work

        employee.showId();
        employee.showSurname();
        employee.showSalary();
    }
}
