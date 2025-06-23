package Lesson27;
import java.io.*;

public class JavaIO {
    public static void main(String[] args) throws Exception {
        // File
        File f = new File("test.txt");
        System.out.println(f.exists());

        // FileInputStream
        FileInputStream fis = new FileInputStream(f);
        System.out.println(fis.read()); // 84 🤔
        // 84 is just an ASCII representation of the first letter T in the test.tsx

        // FileOutputStream
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(84); // replaces the entire file content with T

        // FileNotFoundException
        File f2 = new File("test2.txt"); // there is no test2.txt
        // FileInputStream fis2 = new FileInputStream(f2); // 💥 java.io.FileNotFoundException
        System.out.println("Continuing program..."); // java will not go here

        // IOException

    }
}
