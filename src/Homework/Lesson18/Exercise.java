package Homework.Lesson18;

public class Exercise {
    public static int[] sort(int[] array) {
       int temp;
       for (int i = 0; i < array.length; i++) {
           int min = array[i];
           int index = i;
           for (int j = i + 1; j < array.length; j++) {
               if (array[j] < min) {
                   min = array[j];
                   index = j;
               }
           }
           if (i != index) {
               temp = array[i];
               array[i] = min;
               array[index] = temp;
           }
       }
       return array;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-9, 3, 10, 65, 3, 0};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

