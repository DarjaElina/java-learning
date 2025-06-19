package Lesson23;

public class Super {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.friendGreeting);
        System.out.println(child.emojis);
    }
}

class Parent {
    String greeting = "Hello";
    String emojis = "☕️, 🩷, 🐶";
    static double Pi = 3.14;
    int sum(int... i) {
        int sum = 0;
        for (int x : i) {
            sum += x;
        }
        return sum;
    }
    static void printStatic() {
        System.out.println("Static Method");
    }
}

class Child extends Parent {
    // String friendGreeting = super.greeting + ", friend! 🩷"; this is the same as
    String friendGreeting = greeting + ", friend! 🩷";

    // but we usually use super only when hiding variables:
    String emojis = super.emojis + ", ⭐️";


    // overriding method from parent class
    int sum(int... i) {
        int result = super.sum(i);
        System.out.println(result);
        return result;
    }

    // ❗️ we cannot call "super" inside static methods
    // because "super" refers to an object of a superclass
    // and static means we don't create an object
}