package Lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions7 {
}

class ExceptionReturnExample2 {
    static StringBuilder createFileInputStream() {
        StringBuilder tiger = new StringBuilder("Tiger");
        try {
            File f = new File("test1.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            return tiger; // java created temporary variable pointing to our initial tiger object
            // at this point, we have 2 variables referring the same object
        } finally {
           tiger.append(" 🐯"); // we change our original tiger object
            // which have 2 variables referring to it.
            // One of them is our temporary tiger prepared for return,
            // but if we change an object
            // no matter what we return, temporary variable, or original one,
            // they both point to the same object, which has been changed on line 20
        }
        return tiger; // returns Tiger 🐯
    }

    public static void main(String[] args) {
        System.out.println(createFileInputStream());
    }
}
