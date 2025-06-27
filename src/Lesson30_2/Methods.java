package Lesson30_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Methods {
    public static void main(String[] args) {
        List<String> moonPhases = List.of("🌕", "🌖", "🌗", "🌘", "🌑", "🌑", "🌒", "🌓", "🌔");
        // printing elements using enhanced foreach
        for (String moonPhase : moonPhases) {
            System.out.print(moonPhase + " ");
        }
        System.out.println();

        // same using .forEach() and lambda expression
        moonPhases.forEach(moonPhase -> System.out.print(moonPhase + " "));
        System.out.println();

        // removing an element from ArrayList with removeIf() and lambda expression
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);

        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();

        integers.removeIf(integer -> integer > 3);
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();

        // or
        Predicate<Integer> p = integer -> integer > 3;
        integers.removeIf(p);


        // sorting an ArrayList with lambdas
        ArrayList<String> letters = new ArrayList<>();
        letters.add("D");
        letters.add("A");
        letters.add("G");
        letters.add("C");
        letters.add("F");
        letters.add("B");
        letters.add("E");
        for (String letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();

        letters.sort((a, b) -> -a.compareTo(b));
        for (String letter : letters) {
            System.out.print(letter + " ");
        }

        // a.compareTo(b)); returns A B C D E F G
        // -a.compareTo(b)); returns G F E D C B A
    }
}
