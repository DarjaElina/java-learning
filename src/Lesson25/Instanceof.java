package Lesson25;

class TotallyUnrelatedToEmployeeClass {}

public class Instanceof {
    public static void main(String[] args) {
        Employee emp = new Teacher();
        Employee emp2 = new Doctor();
        Employee emp3 = new Driver();
        System.out.println(emp instanceof Employee); // true, Employee is Employee
        System.out.println(emp instanceof Teacher); // true, Teacher is an Employee
        System.out.println(emp instanceof Driver); // false, Teacher is NOT a Driver
        System.out.println(emp instanceof HelpCapable); // true

        // BUT
        // System.out.println(emp2 instanceof TotallyUnrelatedToEmployeeClass); // ❌ Compiler Error
    }
}
