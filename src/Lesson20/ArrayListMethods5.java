package Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";

        ArrayList<String> letters = new ArrayList<>();
        letters.add(c);
        letters.add(a);
        letters.add(d);
        letters.add(b);
        System.out.println(letters); // [c, a, d, b]
        // Collections.sort()
        Collections.sort(letters);
        System.out.println(letters); // [a, b, c, d]

        // equals()
        ArrayList<String> letters1 = letters;
        System.out.println(letters.equals(letters1)); // true

        ArrayList<String> copiedLetters = new ArrayList<>();
        copiedLetters.add(a);
        copiedLetters.add(b);
        copiedLetters.add(c);
        copiedLetters.add(d);
        System.out.println(copiedLetters.equals(letters)); // also true, ArrayList has itw own implementation of equals
    }
}
