package Lesson28;
import java.io.*;

public class ExceptionsInMethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Cow();
        try {
            animal.run();
        } catch(IOException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

class Animal {
    void run() throws IOException {
        System.out.println("Animal runs");
    }
}

class Cow extends Animal {
    // we cannot tell that run() in Cow
    // throw superclasses of IOException
    // only subclasses
    void run() throws FileNotFoundException {
        System.out.println("Cow runs 🐮");
    }
    // but we can throw any unchecked exceptions (runtime exceptions)

    // overloaded methods can throw any exceptions
    void run(String speed) throws Exception {
        System.out.println("Cow runs 🐮, speed: " + speed);
    }
}
