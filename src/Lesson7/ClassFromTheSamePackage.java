package Lesson7;

public class ClassFromTheSamePackage {
    public static void main(String[] args) {
        Employee e1 = new Employee("John");
        e1.printName();

        Employee e3 = new Employee(20);
        e3.printAge();
    }
}
