package Lesson7;

public class A {
    public static void main(String[] args) {
        // we can access the B class by its name, because they are in the same package
        B b = new B();

        // if we try to access class from another package (Lesson6/Employee), we will get a compiler error
        // we can either import class import Homework.Lesson5.Employee;
        // or access it with its full name
        Lesson6.Employee e = new Lesson6.Employee(1, "Smith", 30);
    }
}
