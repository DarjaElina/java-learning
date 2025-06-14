package Lesson18;

public class IntroToExceptions {
    static String s;
    public static void main(String[] args) {
        // int[] arr = new int[-3]; // ❌ NegativeArraySizeException: -3

        // ArrayIndexOutOfBoundsException
        int[] arr2 = new int[3];
        arr2[0] = 1;
        arr2[1] = 1;
        arr2[2] = 1;
        // arr2[3] = 1; // ❌ ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        // NullPointerException
        int[][] arr3 = new int[3][];
        // System.out.println(arr3[0][1]); // ❌ NullPointerException

        // NullPointerException on String example
        System.out.println(s.length()); // ❌ NullPointerException
    }
}
