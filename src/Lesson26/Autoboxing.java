package Lesson26;
import java.util.ArrayList;
import java.util.Arrays;

public class Autoboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // we are adding primitive, but the compiler is okay with that
        // Why?
        // because Java uses autoboxing under the hood.
        // 1 becomes Integer and only then gets added to our list

        // Another autoboxing example
        Long l = 50L;

        // This will not work 👇
        // Long l = 50; // 50 is int, it cannot be converter to Long
    }
}
