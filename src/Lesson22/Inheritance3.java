package Lesson22;

public class Inheritance3 {
}

class Animal {
    String name;
    String species;
    public void eat() {
        System.out.println("I can eat");
    }

    Animal(String n) {
        this(n, null);
    }
    Animal(String n, String s) {
        name = n;
        species = s;
    }
}

class Wolf extends Animal {
    Wolf() {
        this(5);
        System.out.println("I am wolf");
    }

    Wolf(int i) {
        super("Balto");
    }
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
    }
}