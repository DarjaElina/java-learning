package Lesson25;

public class NumericPromotion {
    public static void main(String[] args) {
        // numeric promotion example
        int i = 5;
        long l = 10;
        System.out.println(i + l); // int cast to long, prints 15

        // i = i * l; ❌ this compiler will now allow
        i = (int) (i * l);
        // Or
        i *= l; // Java casts automatically

        float f = 3.14f;
        int i1 = 10;
        System.out.println(f + i1); // automatically converts to decimal, 13.14

        byte b = 3;
        short s = 4;
        char c = 5;
        System.out.println(b + s + c); // all were converter to int, 12

        byte b2 = 10;
        float f2 = 7;
        double d2 = 2.0;
        System.out.println(b2 + f2 - d2); // at the end, the result will be of type double
        // int i3 = b2 + f2 - d2; ❌ error
        double d3 = b2 + f2 - d2; // ✅ good

    }
}
