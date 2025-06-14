package Lesson18;

public class StringAndStringBuilderWithArrays {
    public static void main(String[] args) {
        // String Constructor that accepts array
        char[] arr = new char[]{'H', 'e', 'l', 'l', 'o'};
        String s = new String(arr);
        System.out.println(s);

        // append()
        StringBuilder sb1 = new StringBuilder("Ok");
        char[] arr1 = {'H', 'e', 'l', 'l', 'o'};
        sb1.append(arr1, 2, 3);
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.insert(1, arr1, 0, 2);
        System.out.println(sb2);
    }
}
