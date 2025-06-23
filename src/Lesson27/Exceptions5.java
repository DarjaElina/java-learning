package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions5 {
    // if errors in different catch blocks are unrelated to each other,
    // like, for example, NullPointerException and ArrayIndexOutOfBoundsException
    // order does not matter

    public static void main(String[] args) {
        // but, for example, in this case
        // order matters, because all of these errors are in the same family
        File f = new File("test.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception");
        } catch (IOException e) {
            System.out.println("I/O Exception");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Throwable e) {
            System.out.println("Throwable");
        }

        // Rule: more specific Exceptions before more generic ones ✅

        // if we try the opposite, we will get compiler error
        // example of unreacheble code
    }
}

class ExceptionExample {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File file = new File("test.txt");
            System.out.println("File instance has been created");
            FileInputStream fis = new FileInputStream(file);
            System.out.println("FileInputStream instance has been created");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Reading from file...");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception");
        } catch (IOException e) {
            System.out.println("I/O Exception");
        } finally {
            System.out.println("Finally block");
        }
    }


    // what is going on in this code? 🤔
    // if we use a file that DOES NOT exist,
    // we will go to catch block with FileNotFoundException.
    // but if it DOES,
    // at some point we will try to read from the stream that has already been closed,
    // result.append(fis.read()); when this fis.close(); already was executed.
    // and then we will get I/O Exception
}
