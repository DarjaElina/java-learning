package Lesson26;

public class MethodPriority2 {
    void method(int a, int b) {
        System.out.println("Calling method with ints");
    }

    void method(long a, long b) {
        System.out.println("Calling method with longs");
    }

    void method(Integer a, Integer b) {
        System.out.println("Calling method with Integers");
    }

    void method(int... args) {
        System.out.println("Calling method with varargs");
    }

    public static void main(String[] args) {
        MethodPriority2 methodPriority2 = new MethodPriority2();
        methodPriority2.method(1, 2); // Calling method with ints, clasest match
    }

}
