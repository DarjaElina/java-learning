package Homework.Lesson6;

public class Calculator {
    int sum() {;
        return 0;
    }

    int sum(int a) {
        return a;
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum());
        System.out.println(calculator.sum(5));
        System.out.println(calculator.sum(5, 3));
        System.out.println(calculator.sum(5, 3, 4));
        System.out.println(calculator.sum(5, 3, 4, 5));
    }
}

