package Lesson20;
import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        // add()
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hei");
        list.add("Moi");
        list.add(0, "Heippa");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        // list.add(5, "Buon giorno"); ❌ Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 4

        // get()
        System.out.println("Item with index 1 is: " + list.get(1));

        // set()
        list.set(3, "Buona sera");
        System.out.println("Item with index 3 is: " + list.get(3));

        // remove()
        list.remove(3);
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        list.remove("Hello"); // this works because remove will remove an element that equals() our parameter, and String implements its own equals() method
        // this would not work with StringBuilder, because .equals() in StringBuilder compares object reference
        for (String s : list) {
            System.out.print(s + " ");
        }

        // addAll()

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Goodbye");
        list2.add("Moi moi");
        list2.add("Adios");

        list.addAll(list2);
        for (String s : list2) {
            System.out.print(s + " ");
        }
        System.out.println();
        list.addAll(1, list2);
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        list2.set(1, "Bye"); // even though we change value here, it will remain unchanged inside list
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
