package Lesson18;

public class Practice {
    public static void maxMin(double[] arr) {
        double max = arr[0];
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max: " + max + " Min: " + min);
    }

    public static void main(String[] args) {
        double[] arr = {1.5, -2.4, 9.9, -10, 4.3};
        maxMin(arr);
        maxMin(new double[] {10, -70.8, 3, 2.1, 2.4});
    }
}
