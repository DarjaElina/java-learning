package Lesson20_2;
import java.util.Arrays;

public class Mismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println(Arrays.mismatch(arr, arr2)); // -1, because they are equal

        int[] arr3 = {1, 2, 2, 4};
        System.out.println(Arrays.mismatch(arr, arr3)); // returns 2
    }
}
