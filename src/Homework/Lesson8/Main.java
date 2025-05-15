package Homework.Lesson8;

public class Main {
    public static void main(String[] args) {
        // using static methods
        System.out.println(Calculator.multiply(3, 5.2, 90));
        System.out.println(Calculator.multiply(11, 3, 0.4));
        Calculator.divide(3.9, 2.7);
        Calculator.divide(11, 4);
        System.out.println(Calculator.findLength(11.3));


        Calculator calculator = new Calculator();
        // using non-static methods
        calculator.findSquare(98.0);
        calculator.showInfo(5.8);
    }
}
