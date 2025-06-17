package Lesson20_3;

import java.util.ArrayList;

public class Methods3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // toArray()
        Object[] arr = list.toArray();
        arr[0] = "Hi"; // not really type safe
        for (Object o : arr) {
            System.out.println(o);
        }
        Integer[] arr2 = list.toArray(new Integer[list.size()]); // more type safe
        // arr2[0] = "Hi"; // ❌ compiler error: Required type: Integer, Provided: String
    }
}
