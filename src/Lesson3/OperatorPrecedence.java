package Lesson3;

public class OperatorPrecedence {
    public static void main(String[] args) {
        // Operator precedence determines the order in which the operators in an expression are evaluated.

        int a = 10;
        int b = 3;

        int c = ++a - b * 2;
        System.out.println(c); // 11 - 6 = 5
        int d = (a++ - b) * 2; // (11 - 3) * 2 = 8 * 2 = 16
        System.out.println(d);

        // 1) ++ -- !
        // 2) * / %
        // 3) + -
        // < <= > >=
        // == !=
        // && ||
        // = += -= *= /= %=
    }
}
