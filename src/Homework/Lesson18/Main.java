package Homework.Lesson18;

public class Main {
    public static int findMin(int[] arr, int startIndex) {
        int min = arr[startIndex];
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findIndex(int a[], int t)
    {
        if (a == null)
            return -1;

        int len = a.length;
        int i = 0;
        while (i < len) {
            if (a[i] == t) {
                return i;
            } i++;
        }

        return -1;
    }
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = findMin(arr, i);
            int temp = arr[i];
            int index = findIndex(arr, min);
            arr[i] = min;
            System.out.println(index);
            arr[index] = temp;
        }
        return arr;
    }

    public static void showArray(String[][] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                if (j != arr[i].length - 1) {
                    System.out.print(arr[i][j] + ", ");
                } else System.out.print(arr[i][j]);
            }
            if (i != arr.length - 1) {
                System.out.print("}, ");
            } else System.out.print(" }");
        }
        System.out.print(" }");
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, -2, 10, 89, 44, 7, -3};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        String[][] arr1 = {{"Hello"}, { "I", "Love", "Java"}, {"It", "Is", "Fun"}, {"🐈", "🐈‍⬛"}};
        showArray(arr1);
    }
}
