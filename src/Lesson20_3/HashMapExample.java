package Lesson20_3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(778, "John Doe");
        map.put(779, "Jane Doe");
        map.put(780, "Jack Smith");
        map.put(781, "Tom Doe");
        map.put(780, "Roberto Carlos"); // Jack Smith is not in the map anymore
        System.out.println(map);

        // remove elements from map
        map.remove(778);
        System.out.println(map);
    }
}
