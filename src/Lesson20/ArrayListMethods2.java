package Lesson20;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        // addAll() example 2
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Hello"));
        list.add(new StringBuilder("Hei"));
        list.add(new StringBuilder("Moi"));

        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Goodbye"));
        list2.add(new StringBuilder("Moi moi"));
        list2.add(new StringBuilder("Adios"));

        list.addAll(list2);
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        list2.get(1).append(" 🩷"); // it will change the value also inside our merged list
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }

        // clear()
        list.clear();
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
    }
}
