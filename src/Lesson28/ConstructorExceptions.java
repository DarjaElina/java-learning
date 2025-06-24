package Lesson28;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConstructorExceptions {
    public static void main(String[] args) {
        // Bird bird = new Owl();
    }
}

class Bird {
    Bird() throws FileNotFoundException {}

    Bird(String color) throws NullPointerException {}
}

class Owl extends Bird {
    // we must define a constructor that throws FileNotFoundException or its superclasses Exceptions
    Owl() throws IOException {
        super();
    }

    // this does not apply to unchecked exceptions
    // we don't need to throw NullPointerException here
    // even though parent class's constructor does it
    Owl(String color) throws FileNotFoundException {}
}

class Human {
    String name;
    int age;
    Human(String name, int age) throws Exception{
        if (age < 0) {
            throw new Exception("Age is incorrect");
        }
        this.name = name;
        this.age = age;
    }
}