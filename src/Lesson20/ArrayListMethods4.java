package Lesson20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> cats = new ArrayList<>();
        StringBuilder mirri = new StringBuilder("Mirri");
        StringBuilder shadow = new StringBuilder("Shadow");
        StringBuilder barsik = new StringBuilder("Barsik");
        cats.add(mirri);
        cats.add(shadow);
        cats.add(barsik);

        // clone()
        ArrayList<StringBuilder> cats1 = (ArrayList<StringBuilder>)cats.clone();
        System.out.println(cats == cats1); // false, they are different objects

        // BUT elements inside these 2 lists reference to same objects ❗️
        System.out.println(cats.get(1) == cats1.get(1)); // true, mirri is the same object in cats and cats1

        cats.get(0).append(" 🧡");
        System.out.println(cats1.get(0)); // Mirri 🧡

        cats.set(0, new StringBuilder("Luna"));
        System.out.println(cats1.get(0)); // ❗️ still prints Mirri 🧡

        // toArray()
        StringBuilder[] cats2 = cats.toArray(new StringBuilder[10]);
        for (StringBuilder cat : cats2) {
            System.out.print(cat + " "); // Luna Shadow Barsik null null null null null null null
        }
        System.out.println();

        // Arrays.asList()
        StringBuilder[] kittens = { mirri, shadow, barsik };
        List<StringBuilder> bigCats = Arrays.asList(kittens);
        kittens[1].append(" 🩷");
        System.out.println(bigCats); // [Mirri 🧡, Shadow 🩷, Barsik]
        kittens[2] = new StringBuilder("Barsik 💙");
        System.out.println(bigCats); // [Mirri 🧡, Shadow 🩷, Barsik 💙]
    }
}
