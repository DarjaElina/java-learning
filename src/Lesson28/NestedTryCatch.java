package Lesson28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NestedTryCatch {
    FileInputStream fis1, fis2;

    public void method() {
        try {
            fis1 = new FileInputStream("test.txt");
            try {
                fis2 = new FileInputStream("test1.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File test1.txt not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File test.txt not found");
        } finally {
            System.out.println("This is outer finally block");
            try {
                fis1.close();
                fis2.close(); // ❌ NullPointerException
            } catch (IOException e) {
                System.out.println("IIOException caught");
            }
        }
    }

    public static void main(String[] args) {
        NestedTryCatch ntc = new NestedTryCatch();
        ntc.method();
    }
}
