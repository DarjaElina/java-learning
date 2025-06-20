package Lesson24;

public class Interfaces1 {
    public static void main(String[] args) {
        HelpCapable helpCapable = new Driver();
        Swimmable swimmable = new Driver();
        Employee employee = new Driver();

        helpCapable.giveFirstAid();
        helpCapable.putOutTheFire("water");
    }
}

// let's imagine:
// we received a letter from the government that from now on
// teachers and drivers should be able to provide first medical aid
// and put out the fire,
// and drivers must also be able to swim

// if we add swim(), giveFirstAid() and putOutTheFire() methods to Employee class,
// this is not what we want. Then Teacher would have swim(),
// and if we create more classes like Developer or Musician, they would have giveFirstAid()
// and putOutTheFire(), and we need that ONLY for Teachers and Drivers

// here we would use Interfaces. 👇
interface HelpCapable {
    // interface can only have abstract methods

    void giveFirstAid();
    void putOutTheFire(String instrument);
}

interface Swimmable {
    void swim();
}

class Employee {
    String name;
    int age;
    void sleep() {
        System.out.println("Employee sleeps");
    }
    void walk() {
        System.out.println("Employee walks");
    }
}

// now we can use these Interfaces on our classes
// for that class must be either abstract or override all methods of interface

class Teacher extends Employee implements HelpCapable {
    int numberOfStudents;
    void teach() {
        System.out.println("Teacher teaches");
    }

    public void giveFirstAid() {
        System.out.println("Teacher gives first aid");
    }
    // why public?
    // because all methods in interfaces are public by default ❗️
    // and remember, we cannot override method and give it a stricter access modifier than in superclass

    public void putOutTheFire(String instrument) {
        System.out.println("Teacher puts out the fire using " + instrument);
    }
}

class Driver extends Employee implements HelpCapable, Swimmable{
    String car;
    void drive() {
        System.out.println("Driver drives");
    }
    public void giveFirstAid() {
        System.out.println("Driver gives first aid");
    }
    public void putOutTheFire(String instrument) {
        System.out.println("Driver puts out the fire using " + instrument);
    }
    public void swim() {
        System.out.println("Driver swims");
    }
}

