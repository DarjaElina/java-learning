package Lesson27;

public class Exceptions4 {

    void printInt() {
        int[] arr = {1, 2};
        System.out.println(arr[5]);
    }

    void printIntAndShowCat() throws ArrayIndexOutOfBoundsException {
        printInt();
        System.out.println("🐈");
    }

    public static void main(String[] args) {
        Exceptions4 ex = new Exceptions4();
        try {
            ex.printIntAndShowCat();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught");
            // Exception methods
            System.out.println("Message: " + e.getMessage());
            System.out.println("StackTrace: ");
            e.printStackTrace();
        }
    }
}
