package Lesson18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Declaration
        int[] array1;
        String[] array2;
        double[][] array3;

        // Allocation
        array1 = new int[8];
        array2 = new String[3];
        array3 = new double[5][2];

        System.out.println(array1.length);
        array2[0] = "Hello";
        array2[1] = "World";
        array2[2] = "!";

        double[] array5;
        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;

        array3[1] = array5;
        System.out.println(array3[1][0]);

    }
}
