package Lesson20_2;

import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {
        // compare()
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 3, 5};
        int[] numbers3 = {1, 2, 3, 5};

        char[] lovely = {'l', 'o', 'v', 'e', 'l', 'y'};
        char[] loved = {'l', 'o', 'v', 'e', 'd'};

        System.out.println(Arrays.compare(numbers, numbers2)); // -1, because 4 < 5, and compare returns -1 if (x < y)
        System.out.println(Arrays.compare(numbers2, numbers)); // returns 1
        System.out.println(Arrays.compare(numbers2, numbers3)); // returns 0

        System.out.println(Arrays.compare(lovely, loved)); // returns -8, ascii difference between d and l, 100 - 108 = -8


        char[] love = {'l', 'o', 'v', 'e'};
        System.out.println(Arrays.compare(love, loved)); // returns -1
        System.out.println(Arrays.compare(loved, love)); // returns 1

        char[] nullArray = null;
        System.out.println(Arrays.compare(nullArray, lovely)); // null is always smaller
    }
}
