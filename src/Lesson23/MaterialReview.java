package Lesson23;

public class MaterialReview {
    public Object returnObj() {
        // return new String("Because String is Object"); ✅ OK
        // return new StringBuilder("StringBuilder is also Object"); ✅ OK
        return new Developer(); // ✅ also OK, Developer is an Object
    }
    public static void main(String[] args) {
        Developer developer = new Developer();
        Employee employee = new Employee();
    }
}

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