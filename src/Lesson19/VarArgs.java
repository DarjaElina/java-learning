package Lesson19;

public class VarArgs {
    static void sum(int a, int b) {
        System.out.println("Calling 1st overloaded method");
        System.out.println(a + b);
    }
    static void sum(int a, int b, int c) {
        System.out.println("Calling 2nd overloaded method");
        System.out.println(a + b + c);
    }

    // what if we need to find a sum of 100 numbers? 🤔

    static void sum(int ...a) {
        System.out.println("Calling 3rd overloaded method");
        // int ...a means any number of arguments of type int
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum();
        sum(1, 2, 3);
        sum(1, 2, 3, 4);
        sum(1, 2);
    }
}
