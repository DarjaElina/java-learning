package Lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions8 {
   void rethrowAnError() throws FileNotFoundException {
        try {
            File f = new File("test1.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            // let's say we caught an exception
            // and handled it only partially
            System.out.println("We've started exception handling, but it's not completely done yet.");
            // we can rethrow it
            throw e;
        } finally {
            System.out.println("This is finally block");
        }
    }

    void catchAnError() {
       try {
           rethrowAnError();
       } catch (Exception e) {
           System.out.println("We completed exception handling.");
       } finally {
           System.out.println("This is finally block");
       }
    }



    public static void main(String[] args) {
    }
}
