package Lesson19;

public class ForeachMultidim {
    public static void main(String[] args) {
        int[][] array = { {3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3} };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();

        // same with enhanced foreach
        for (int[] row : array) {
            for (int col : row) {
                System.out.print(col + " ");
            }
        }
    }
}
