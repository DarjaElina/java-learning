package Lesson18;

import java.util.Arrays;

public class ArrayComparison {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(arr1 == arr2); // false
        System.out.println(Arrays.equals(arr1, arr2)); // true, equals method from java.util.Arrays package works fine
        System.out.println(arr1.equals(arr2)); // false
    }
}
