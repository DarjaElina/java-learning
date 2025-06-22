package Lesson26;

public class MethodPriority {
//    void printValue(int value) {
//        System.out.println(value);
//        System.out.println("Calling printValue with int");
//    }

    void printValue(byte value) {
        System.out.println(value);
        System.out.println("Calling printValue with double");
    }

    void printValue(long value) {
        System.out.println(value);
        System.out.println("Calling printValue with long");
    }

    void printObject(Object object) {
        System.out.println("Calling printObject with Object");
    }

    void printObject(String string) {
        System.out.println("Calling printObject with String");
    }

    public static void main(String[] args) {
        MethodPriority methodPriority = new MethodPriority();
        methodPriority.printValue(1); // Calling printValue with int
        // because 1 by default is int

        // if we didn't have a method with int
        methodPriority.printValue(2); // Calling printValue with long
        // int automatically cast to LARGER type
        // casting to smaller we would need to do manually


        methodPriority.printObject("Hello"); // Calling printObject with String
        // String is the closest match
    }
}
