package Lesson3;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // Arithmetic Operators
        // Addition (+)
        int a = 10;
        int b = 3;
        int c = a + b;
        System.out.println(a + b);
        System.out.println(c);

        // Subtraction (-)
        System.out.println(a - b);

        // Multiplication (*)
        System.out.println(a * b);

        // Division
        int d = a / b;
        // d will be 3.3333333333333335
        // but because we said int d, it will be 3, whole number
        System.out.println(d); // will print 3, not 3.3333333333333335
        // Note: we are not rounding, but simply removing the fractional part

        double e = 10;
        double f = 3;
        System.out.println(e / f); // will print 3.3333333333333335 because now we have double types

        // Modulo
        System.out.println(a % b); // 1

        // Unary operators
        int incrementedA = a++;
        int decrementedB = b--;
        System.out.println(incrementedA); // 11;
        System.out.println(decrementedB); // 2

        // Prefix
        ++a;
        --a;
        // Postfix
        a++;
        a--;

        // Difference between prefix and postfix
        int num1 = 5;
        int num2 = 3;

        int diff = num1 - num2;

        System.out.println(diff); // will print 2

        int diffWithPostfix = num1 - num2++; // here at the moment of subtraction num2 is still 3 ❗, we are doing 5 - 3

        System.out.println("Difference with postfix is: " + diffWithPostfix); // will print 2
        System.out.println("num2 is now: " + num2); // here num2 will be 4

        // Note: at this point num2 is 4

        int diffWithPrefix = num1 - ++num2; // already at this point num2 become 5 ❗️, we are doing 5 - 5
        System.out.println("Difference with prefix is: " +diffWithPrefix); // will be 0


        // Task:
        // a = 5
        // find answer:
        // ++a - --a - a-- + a++ = ?
        // 1) first a increment instantly: it's 6
        // 2) the next a decrement instantly: it's 5
        // we get 6 - 5
        // the next a at the moment of subtraction is still 5 (but it will become 4 on the next operation)
        // the next a has postfix unary increment, so it will be incremented only AFTER the expression
        // 6 - 5 - 5 + 4 = 0;

        // We can do arithmetic operations with char

        char character = 'a'; // 97 in unicode
        int integer = 10;
        System.out.println(character + integer); // 97 + 10 = 107

        int integer2 = character;
        short s = 500;

        // The following we cannot do, because short will not fit; char is from 0 to 65535, short from -32768 to 32767
        // Also we cannot assign negative integers to char type
        // char character2 = s;
    }
}
