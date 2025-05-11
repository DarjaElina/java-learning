package Lesson4;

public class ClassesAndObjects {
    int a = 20;
    public static void main(String[] args) {
        int b = 10;
        System.out.println("Welcome to the 4th lesson!");
        System.out.println(b);

        // The following will cause a compiler error:
        // System.out.println(a);
    }
}

class TestClass {
    public static void main(String[] args) {
        System.out.println("I am inside non public class");
    }
}
