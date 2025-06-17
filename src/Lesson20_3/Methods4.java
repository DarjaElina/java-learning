package Lesson20_3;

import java.util.ArrayList;
import java.util.List;

public class Methods4 {
    public static void main(String[] args) {
        // we can create a List like this, using add()
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Madrid");
        cities.add("Bangalore");
        cities.add("Berlin");
        cities.add("Malaysia");

        // or using list.of():
        List<String> cities2 = List.of("Madrid", "Bangalore", "Berlin", "Malaysia"); // ❗️ this List is immutable ❗️
        // cities2.add("Helsinki"); // ❌ runtime java.lang.UnsupportedOperationException

        // copyOf()
        List<String> cities3 = List.copyOf(cities); // ❗️also immutable

        // Lists created with of() and copyOf() cannot contain null elements
        List<String> countries = List.of("Finland", "Sweden", "Switzerland", null); // ❌ runtime java.lang.NullPointerException
    }
}
