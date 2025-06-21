package Lesson25;

public class InstanceofExample {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man man = new Man();
        Student student = new Student();

        if (j instanceof Jumpable) {
            System.out.println("j is Jumpable");
        }

        if (man instanceof Human) {
            System.out.println("man is Human");
        }

        // ❌ Compile-time error:
        // Student and Human are completely unrelated classes,
        // so the compiler knows this check can never be true.
        // That's why this line won't compile.
//        if (student instanceof Human) {
//            System.out.println("student is Human");
//        }

        // ✅ This compiles even though Student doesn't implement Jumpable.
        // Why?
        // Because it's possible that a subclass of Student might implement Jumpable,
        // so Java allows the check.
        if (student instanceof Jumpable) {
            System.out.println("student is Jumpable");
        }

        // Explanation:
        // Student student = new Student();
        // The compiler knows that Student and Human are not related at all.
        // So the instanceof check is not allowed, it would always be false.
        //
        // But Jumpable is an interface, and even though Student doesn't implement it directly,
        // some subclass of Student might. So the check is allowed.

        // This line compiles 👇
        System.out.println(student instanceof Jumpable); // but prints false
    }
}

interface Jumpable {}

class Human implements Jumpable {}

class Man extends Human {}

class Student {}
