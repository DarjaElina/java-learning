package Lesson22;

public class Inheritance {
    void increaseSalary(Employee e) {
       e.salary += 100;
    }
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setName("Jack");
        developer.setProgrammingLanguage("Java ☕️");
        System.out.println(developer.getName());
        System.out.println(developer.getProgrammingLanguage());
        developer.walk();
        developer.sleep();
        developer.writeCode();
    }
}

// three class with almost the same fields and methods 👇
// no inheritance ❌
// verbose, code repetition ❌
class Doctor {
    private String name;
    private int age;
    private int experience;
    private String speciality;
    void sleep() {
        System.out.println("I can sleep");
    }
    void walk() {
        System.out.println("I can walk");
    }
    void cure() {
        System.out.println("I can cure patients");
    }
}

class Teacher {
    private String name;
    private int age;
    private int experience;
    private int students;
    void sleep() {
        System.out.println("I can sleep");
    }
    void walk() {
        System.out.println("I can walk");
    }
    void teach() {
        System.out.println("I can teach students");
    }
}

class Driver {
    private String name;
    private int age;
    private int experience;
    private String carName;
    void sleep() {
        System.out.println("I can sleep");
    }
    void walk() {
        System.out.println("I can walk");
    }
    void driveCar() {
        System.out.println("I can drive a car");
    }
}

// same example with inheritance
// less verbose; cleaner code ✅
class Employee {
    private String name;
    private int age;
    private int experience;
    double salary = 1000.00;

    public String getName() {
        return this.name;
    }
     public void setName(String name) {
        this.name = name;
     }

    void sleep() {
        System.out.println("I can sleep");
    }
    void walk() {
        System.out.println("I can walk");
    }
}

class Musician extends Employee {
    private String instrument;
    void playInstrument() {
        System.out.println("I can play my instrument");
    }
}
class Developer extends Employee {
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    void writeCode() {
        System.out.println("I can write code");
    }
}

class BackendDeveloper extends Developer {
    String[] databases;
    void createDBConnection() {}
}

class FrontendDeveloper extends Developer {
    String[] uiFrameworks;
    void buildUI() {}
}
