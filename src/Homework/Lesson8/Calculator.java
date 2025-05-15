package Homework.Lesson8;

public class Calculator {
    static final double PI = 3.14f;

    public static double multiply(double a, double b, double c) {
        return a * b * c;
    }

    public static void divide(double a, double b) {
        int quotient = (int) (a / b);
        double remainder = a % b;
        System.out.println("Whole part: " + quotient + ", Remainder: " + remainder);
    }

    public double findSquare(double radius) {
        return PI * radius * radius;
    }

    public static double findLength(double radius) {
        return 2 * PI * radius;
    }

    public void showInfo(double radius) {
        System.out.println("Radius: " + radius + ", Square: " + findSquare(radius) + " Length: " + findLength(radius));
    }
}
