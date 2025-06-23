package Lesson27;
import java.io.*;

public class Exceptions2 {
    public static void main(String[] args) {
        File f = new File("test.txt");

        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("All good 😸");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e);
        } catch (NullPointerException e) {
            // we can have multiple catch blocks
            System.out.println("NullPointerException caught: " + e);
        } finally {
            System.out.println("Finally called");
        }

        System.out.println("Program continues...");

        // here 👆 it is not only clever to use try/catch,
        // but Java actually requires us to use it.
        // if we try to create a new instance of FileInputStream,
        // we will get compiler error
       //  FileInputStream fis = new FileInputStream(f); ❌ Unhandled exception: java.io.FileNotFoundException
    }
}
