package Lesson25;

public class Narrowing {
    public static void main(String[] args) {
        // Narrowing without casting:
        // Value of a wider data type is assigned to a smaller data type
        byte b = 3;
        short s = -6;
        char c = 100;

        // Narrowing with casting
        int i = 3;
        short s2 = (short)i;

        // cheating 👇
        int i2 = 1000000;
        // trying to cast to short which is from -32,768 to 32,767
        short s3 = (short)i2; // compiler allows that, but...
        System.out.println(s3); // 16960 🤷‍♀️
    }
}

class InterestingExample1 {
    public static void main(String[] args) {
        int i = 2147483647;
        System.out.println(i + 1); // -2147483648 🤯

        // min int----------------------max int
        // -2147483647-----------------2147483647
        // -------------------------------------- + 1
        // it does not fit anymore, so it goes back to -2147483647
        // kind of drawing a circle
    }
}
