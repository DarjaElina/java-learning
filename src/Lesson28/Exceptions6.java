package Lesson28;
import java.io.*;

public class Exceptions6 {
    static int createFileInputStream() {
        try {
            File f = new File("test.txt");
            FileInputStream fis = new FileInputStream(f);
            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e);
            return 10;
        } finally {
            System.out.println("Finally block"); // this will be printed anyway and first
            return 20; // if we use return here, it will replace returns in try and catch
        }
    }
    public static void main(String[] args) {
        System.out.println(createFileInputStream());
    }
}

class ExceptionReturnExample1 {
    static int createFileInputStream() {
        int res = 5;
        try {
            File f = new File("test1.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Res in catch block: " + res);
            return res; // at this point return value 5 is saved temporarily
        } finally {
            res = 10;
            System.out.println("Res in finally block: " + res);
            // we see no more returns in finally,
            // and even though we have this res = 10;
            // it is too late, because we already have a return from catch
            // then java sees that there is no more return here
            // and methods returns 5
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(createFileInputStream());
    }
}
