package Lesson24;

public class Interfaces2 {
    public static void main(String[] args) {
        Jumpable j1 = new Human();
        Jumpable j2 = new Animal();
    }
}

// These classes have no relationship
// bit we can create relationship using interface

class Human implements Jumpable {}

class Animal implements Jumpable {}


interface Jumpable {}

// interface can extend another interface
interface Walkable {
    void walk();
}

interface Runable extends Walkable {
    void run();
}

// abstract classes can implement interfaces

abstract class Child implements Runable {}