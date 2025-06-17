package Lesson20_3;

import java.util.ArrayList;
import java.util.List;

public class Methods2 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Tiger");
        animals.add("Chicken");

        System.out.print(animals + " ");
        System.out.println();

        // sublist()
        List<String> subAnimals = animals.subList(1, 4);
        System.out.println(subAnimals); // [Dog, Tiger, Chicken]

        // subList is a ❗️view❗️ into the original list, any changes here also affect animals
        subAnimals.add("Fox");

        System.out.println(subAnimals); // [Dog, Tiger, Chicken, Fox]

        System.out.print(animals + " "); // prints updated original list: [Cat, Dog, Tiger, Chicken, Fox]


        animals.add("Frog");
        // this modifies the original list's structure (size changed),
        // BUT it breaks the sublist view because it's no longer in sync
        System.out.print(animals + " "); // ✅ this still works, prints the updated list

        System.out.print(subAnimals); // ❗️ Runtime Exception occurs here: java.util.ConcurrentModificationException
        // Why? Because subAnimals is a ❗️view❗️ of a specific range of animals
        // and adding "Frog" to `animals` changes its size → invalidates the sublist
    }
}

