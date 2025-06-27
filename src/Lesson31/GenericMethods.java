package Lesson31;

import java.util.ArrayList;

public class GenericMethods {
    public static void main(String[] args) {
        ArrayList<String> pets = new ArrayList<>();
        pets.add("Dog");
        pets.add("Cat");
        pets.add("Snake");
        pets.add("Pig");

        String kitty = ItemGetter.getSecondItem(pets); // ✅ good
        System.out.println(kitty);

        // Integer integerKitty = ItemGetter.getSecondItem(pets); ❌ compiler will not allow that

    }
}

class ItemGetter {
    public static <T> T getSecondItem(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}
