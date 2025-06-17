package Lesson21;

public class Review1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a < 4 ? "Cat 🐈" : "Dog 🐕");
        String res = a < 4 ? "Cat 🐈" : "Dog 🐕";
        // int res1 = a < 4 ? "Cat 🐈" : "Dog 🐕"; ❌ Compiler error: Required type: int, Provided: String

        int b = 5;
        int c = 5;
        int d = (b < 6) ? b++ : c++;
        System.out.println("b: " + b); // only b increments, 6
        System.out.println("c: " + c); // c is still 5
    }
}
