package Lesson6;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    // constructor 1
    public  Employee(int newId, String newSurname, int newAge) {
       this(newId, newSurname, newAge, 0.0, null);
    }

    // constructor 2
    Employee(String newSurname, int newAge) {
        this(0, newSurname, newAge, 0.0, null);
    }

    // constructor 3
    Employee(int newId, String newSurname, int newAge, double newSalary, String newDepartment) {
        id = newId;
        surname = newSurname;
        age = newAge;
        salary = newSalary;
        department = newDepartment;
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Smith", 25);
        System.out.println(e1.id);
        System.out.println(e1.surname);

        Employee e2 = new Employee("Doe", 30);

        Employee e3 = new Employee(3, "Black", 40, 1000, "IT");
    }
}
