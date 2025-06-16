package Lesson20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIterator {
    public static void main(String[] args) {
        String musti = "Musti";
        String rex = "Rex";
        String max  = "Max";
        ArrayList<String> dogs = new ArrayList<>();

        dogs.add(musti);
        dogs.add(rex);
        dogs.add(max);

        ListIterator<String> iterator = dogs.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove(); // we can remove elements in ArrayList using iterators
        }
    }

}
