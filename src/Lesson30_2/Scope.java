package Lesson30_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Scope {
    public static void main(String[] args) {
        List<String> flowers = new ArrayList<>();
        flowers.add("🌸");
        flowers.add("🌼");
        flowers.add("🌺");
        flowers.add("🌷");

        for (String flower : flowers) {
            String bee = " Bee 🐝";
            // Predicate<String> p = flower -> flower.length() > 4; ❌ Variable 'flower' is already defined in the scope
            // Predicate<String> p = f -> f.length() > 4; // ✅ good

            // we can use variables defined outside in our lambdas
            Predicate<String> isFlower = f -> {
                // System.out.println(bee);
                return f.length() > 1;
            };

            // but if we try to change this variable somewhere
            bee = "Another bee 🐝";
            // we will get compiler error on line 22
            // ❌ Variable used in lambda expression should be final or effectively final.
            // effectively final means that we do not use keyword final,
            // but also do not change the value of variable anywhere
        }
    }
}
