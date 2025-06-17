package Lesson21;

public class Review2 {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("Hello");
        s2 = new String("Bye");
        s1 = s2;
        String s3 = s1;
        s1 = null;
    }
}


// Recursive constructor example
class Car {
    public Car() {
        // this(); // ❌ Compiler error: Recursive constructor call
    }
}
