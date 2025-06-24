package Lesson28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NestedTryCatch3 {
    static String method() {
        String s1 = "Cats are cute";
        String s2 = null;
        try {
            try {
                s1 += " 💚"; // Cats are cute 💚
                s2.charAt(3); // NullPointerException
                s1 += " 💙";
            } catch (NullPointerException e) {
                s1 += " 💜"; // Cats are cute 💚 💜
                throw new RuntimeException();
            } finally {
                s1 += " 💛"; // // Cats are cute 💚 💜 💛
                throw new Exception();
            }
        } catch (Exception e) {
            s1 += " 🩶"; // // Cats are cute 💚 💜 💛 🩶
        }
        return s1;
    }

    public static void main(String[] args) {
        System.out.println(method()); // Cats are cute 💚 💜 💛 🩶
    }
}

class NestedTryCatchExample {
    static FileInputStream fis1, fis2;
    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test.txt");
            System.out.println("File test.txt was found ✅");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("Error closing file fis2");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File test.txt was not found ❌");
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
    }
}
