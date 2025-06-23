package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions3 {
    // if we are not using try/catch,
    // we can say that this method throws and Exception
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("test1.txt");

        FileInputStream fis = new FileInputStream(f);

        System.out.println("Program continues..."); // but then again, the program will just throw and never reach this line

    }
}

class ExceptionsExample {
    void createFileStream() {
        File f = new File("test1.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e);
        }
    }

    void greetAndCreateFileStream() {
        System.out.println("Hello!");
        createFileStream(); // all good ✅
    }
}

class ExceptionsExample2 {
    void createFileStream() throws FileNotFoundException {
        File f = new File("test1.txt");
        FileInputStream fis = new FileInputStream(f);
    }

    void greetAndCreateFileStream1() {
        System.out.println("Hello!");
        // here the compiler knows that createFileStream can throw FileNotFoundException,
        // and we have to handle it here as well
        try {
            createFileStream();
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e);
        }
    }

    void greetAndCreateFileStream2() throws FileNotFoundException {
        createFileStream(); // here all good ✅
    }

    public static void main(String[] args) {
        ExceptionsExample2 ex = new ExceptionsExample2();
        ex.greetAndCreateFileStream1(); // ✅ good, we did error handling in this method
        // ex.greetAndCreateFileStream2(); // ❌ compiler error: Unhandled exception: java.io.FileNotFoundException
        // again, we have an option to use try/catch or user throws in method signature

        try {
            ex.greetAndCreateFileStream2(); // now all good 👍
        } catch (FileNotFoundException e) {
            System.out.println("Exception: " + e);
        }
    }
}
