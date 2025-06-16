package Lesson20;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> cats = new ArrayList<>();
        cats.add(new StringBuilder("Mirri"));
        cats.add(new StringBuilder("Shadow"));
        cats.add(new StringBuilder("Barsik"));

        for (StringBuilder cat : cats) {
            System.out.print(cat + " ");
        }
        System.out.println();

        // indexOf()
        System.out.println(cats.indexOf(new StringBuilder("Shadow"))); // will not find anything, because StringBuilder's equals() compares addresses

        StringBuilder luna = new StringBuilder("Luna");
        cats.add(luna);

        System.out.println(cats.indexOf(luna)); // will print 3

        // lastIndexOf();
        cats.add(0, luna);
        System.out.println(cats.indexOf(luna)); // will print 0
        System.out.println(cats.lastIndexOf(luna)); // will print 4

        // size()
        System.out.println("We have " + cats.size() + " cats. 🐈"); // We have 5 cats. 🐈

        // isEmpty()
        System.out.println(cats.isEmpty()); // false

        // contains()
        System.out.println(cats.contains(luna)); // true
        StringBuilder daisy = new StringBuilder("Daisy");
        System.out.println(cats.contains(daisy)); // false

        // toString()
        System.out.println(cats.toString()); // [Luna, Mirri, Shadow, Barsik, Luna]

    }
}
