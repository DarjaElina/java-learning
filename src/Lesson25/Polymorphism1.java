package Lesson25;

public class Polymorphism1 {
    public static void main(String[] args) {
        Employee t = new Teacher();
        Employee d = new Doctor();
        Employee dr = new Driver();
        HelpCapable t1 = new Teacher();

        // polymorphism in action 👇
        t.work(); // Teacher works
        d.work(); // Doctor works
        dr.work(); // Driver works
        // same methods behave differently depending on from which object they are called
    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements HelpCapable {
    void work() {
        System.out.println("Teacher works");
    }
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee implements HelpCapable {
    void work() {
        System.out.println("Driver works");
    }

    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee implements HelpCapable {
    void work() {
        System.out.println("Doctor works");
    }

    public void help() {
        System.out.println("Doctor helps");
    }
}

interface HelpCapable {
    void help();
}