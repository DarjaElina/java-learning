package Lesson26;

public class MethodPriority3 {
    static void method(String s) {
        System.out.println("Calling method with String");
    }
    static void method(String... s) {
        System.out.println("Calling method with String varargs");
    }
    static void method(Object s) {
        System.out.println("Calling method with Object");
    }
    static void method(String s1, String s2) {
        System.out.println("Calling method with 2 Strings");
    }

    static void anotherMethod(Long l) {
        System.out.println("Calling another method with Long");
    }
    static void anotherMethod(Long... l) {
        System.out.println("Calling another method with Long varargs");
    }

    static void anotherMethod(long l1) {
        System.out.println("Calling another method with long primitive");
    }

    static void anotherMethod(Object l) {
        System.out.println("Calling another method with Object");
    }

    static void anotherMethod(Integer i) {
        System.out.println("Calling another method with Integer");
    }


    public static void main(String[] args) {
        method("Hello");

        anotherMethod(50);
    }
}
