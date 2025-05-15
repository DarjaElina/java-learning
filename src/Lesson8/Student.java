package Lesson8;

public class Student {
    // instance variables
    // every object that is created from this class has these variables
    String name;
    int year;
    int count; // every time we create new object, count is 0
    static int staticCount; // class variable, it belongs to a class, not an instance
    int a;
    static int b;

    public Student(String name, int year) {
        count++;
        staticCount++;
        this.name = name;
        this.year = year;
        System.out.println("Student #" + count + " created");
        System.out.println("Student #" + staticCount + " created");
    }

    public static void showStaticCount() {
        System.out.println("Total students count: " + staticCount);
    }

    public void showInfo() {
        System.out.println("Welcome to our class");
    }

    void testMethod() {
        a++; // works fine
        b++; // also works fine
    }

    static void testMethod2() {
        // a++; error => Non-static field 'a' cannot be referenced from a static context
        b++; // works fine
        // to use non static variable inside static method we need to create a class instance
        Student s1 = new Student("John", 2018);
        s1.a++; // now we can use it
    }

    public static void Main(String[] args) {
        System.out.println(staticCount); // we don't need to use Student.staticCount, because we are inside this class
        showStaticCount();
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("John", 1);
        Student s2 = new Student("Jane", 2);
        Student s3 = new Student("Jack", 3);
        Student s4 = new Student("Jill", 4);

        System.out.println(Student.staticCount);
        Student.showStaticCount();
    }
}
