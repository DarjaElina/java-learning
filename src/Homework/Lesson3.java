package Homework;

public class Lesson3 {
    public static void main(String[] args) {
        int integer1 = 5;
        int integer2 = 11;
        double double1 = 5.5;
        double double2 = 1.3;
        long long1 = 20L;
        double result = 0;

        // 1) ++ -- !
        // 2) * / %
        // 3) + -
        // < <= > >=
        // == !=
        // && ||
        // = += -= *= /= %=

        result = integer2 / double1 + double2 % integer1 - long1;
        // result = 11 / 5.5 + 1.3 % 5 - 20;
        // result = 2 + 1.3 - 20
        // result = 16.7
        System.out.println("Result: " + result);

        int a = 5;
        System.out.println(a-- - --a + ++a + a++ + a);
        // 5 - 3 + 4 + 4 + 5 = 15

        int b = 8;
        System.out.println(++b - b++ + ++b - --b);
        // 9 - 9 + 11 - 10 = 1

    }
}
