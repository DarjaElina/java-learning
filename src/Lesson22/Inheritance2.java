package Lesson22;

public class Inheritance2 {
}

class Human2 {
    public String name = "John";
    public static double salary = 1000.00;
    public void work() {
        System.out.println("I can work");
    }
    public static void rest() {
        System.out.println("I can rest");
    }

    // private fields cannot be inherited
    private String surname = "Doe";


    // but we can still access amd modify them using getters and setters
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

}

class Student extends Human2 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(Student.salary);
        student.work();
        Student.rest();
        System.out.println(student.getSurname());
    }
}
