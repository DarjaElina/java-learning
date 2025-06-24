package Lesson28;

public class ErrorSubclasses {
    // ExceptionInitializerError
    // thrown when in static initializers we get runtime exception

    static {
        // int a = Integer.parseInt("42 cats"); // java.lang.NumberFormatException,
        // but because it's thrown inside static initializer block,,
        // we will get ExceptionInitializerError:
        // Exception in thread "main" java.lang.ExceptionInInitializerError
        // Caused by: java.lang.NumberFormatException: For input string: "42 cats"
    }

    // same here, Runtime Exception, but in static context => ExceptionInitializerError
    static String s = null;
    static int a = s.length();

    public static void main(String[] args) {

    }
}
