package Lesson18;
import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
       int[] arr1 = {1, 9, 3, -8, 0, 5, 4, 1};

       for (int i = 0; i < arr1.length; i++) {
           System.out.print(arr1[i] + " ");
       }

       System.out.println();

       // sort()

       Arrays.sort(arr1);
       for (int i = 0; i < arr1.length; i++) {
           System.out.print(arr1[i] + " ");
       }
       System.out.println();

       // binarySearch()
        int index = Arrays.binarySearch(arr1, -8);
       System.out.println(index);

       int nonExistIndex = Arrays.binarySearch(arr1, 10);
       System.out.println(nonExistIndex); // prints -9 🤔
        // Why? 🤯
        // if 10 were in array, it would be on index 8
        // we add minus, get -8 and then -8 - 1 = -9
        System.out.println(arr1);
    }
}
