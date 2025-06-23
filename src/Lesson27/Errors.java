package Lesson27;

public class Errors {
    static void recursion() {
        System.out.println("Recursion is running 😈");
        recursion();
    }

    public static void main(String[] args) {
        recursion(); // recursive call of method will call a java.lang.StackOverflowError

        // we should NOT define Errors in methods' signature and handle them within try/catch
        // we can just catch them
        // defining or handling Errors is considered bad practice
        // Error, same as runtime exceptions, are considered unchecked
    }
}
