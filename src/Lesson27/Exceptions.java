package Lesson27;

public class Exceptions {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        // System.out.println(array[3]); // 💥 java.lang.ArrayIndexOutOfBoundsException
        // System.out.println("Hello! 💙"); // our program will never reach this line

        // we can use try/catch/finally to handle error

//        try {
//            System.out.println(array[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("We caught an exception! 😼");
//        } finally {
//            System.out.println("This is the finally block!");
//        }
//
//        System.out.println("Hello! 💙");

        // but what if we try to catch different exception?
        try {
            System.out.println(array[3]);
        } catch (NullPointerException e) {
            System.out.println("We caught an exception! 😼 :" + e); // this will not be printed
        } finally {
            System.out.println("This is the finally block!");
        }

        System.out.println("Hello! 💙"); // this will not be printed
        // we just get a runtime exception and our program will exit

        // but this is not the best use of try/catch
        // we shouldn't really catch exceptions like NullPointerException or ArrayIndexOutOfBoundsException.
        // See more realistic example in Exceptions2

    }
}
