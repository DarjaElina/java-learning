package Homework.Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static ArrayList<String> findUniqueValues(String... inputs) {
        ArrayList<String> result = new ArrayList<>(inputs.length);
        for (String input : inputs) {
            if (!result.contains(input)) {
                result.add(input);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> inputs = findUniqueValues();
        System.out.println(inputs);

        ArrayList<String> inputs2 = findUniqueValues("cat", "dog", "cat", "frog", "toad", "foxy", "dog", "bee");
        System.out.println(inputs2);
    }
}
