package Lesson20_3;

import java.util.ArrayList;

public class Methods1 {
    public static void main(String[] args) {
        ArrayList<String> count = new ArrayList<>();
        count.add("one");
        count.add("two");
        count.add("three");
        count.add("four");
        count.add("five");
        System.out.print(count + " ");
        System.out.println();

        ArrayList<String> elements = new ArrayList<>();
        elements.add("one");
        elements.add("three");
        elements.add("four");

        // removeAll()
        // count.removeAll(elements);
        // System.out.print(count + " "); // [two, five]

        // retainAll()
        count.retainAll(elements);
        System.out.print(count + " "); // [one, three, four]
        System.out.println();

        //containsAll()
        System.out.println(count.containsAll(elements)); // true
    }
}
