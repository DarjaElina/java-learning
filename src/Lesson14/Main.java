package Lesson14;

public class Main {

    static void printNumber(int n) {
        System.out.println(n);
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("meow 🐈‍⬛");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // we can also do this
        int i = 1;
        for (; i <= 10; i++) {
            System.out.println(i);
        }

        // or this
        for (int j = 1, k = 2, l = 3; j <= 10; j++, k++, l++) {
            System.out.println(j);
            System.out.println(k);
            System.out.println(l);
        }

        // or we can call a method
        for (int n = 1; n <= 10; n++, printNumber(10)) {
            System.out.println(n);
        }

        for (int n = 0; n <= 30; n++) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }

        // unreachable statement, Loop condition is always false making the loop body unreachable
//        for (int n = 0; false; n++) {
//            System.out.println(n);
//        }

        int a = 5;
        if (a > 10) {
            for (int n = 1; n <= a; n++)
                System.out.println(n); // for will be executed even if we don't use curly braces, but it's better to use them anyway
        }

        for (int n = 1; n <= 30; n++) {
            if (n == 15) {
                continue;
            }
            if (n == 22) {
                break;
            }
            System.out.println(n);
        }

        for (;;) {}
    }


}
