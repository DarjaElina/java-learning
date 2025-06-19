package Lesson23;

public class TrickyOverloadingExample {
    public static void main(String[] args) {
        Bird owl = new Owl();
        owl.printName(new ForestBird()); // what will it print? 🤔
        // it prints "Bird", not "Owl" ❗️
        // because this is not method overriding, but method overloading!
        // parameters in Bird's printName() if Bird, while in Owl's and ForestBird's is ForestBird
    }
}

class Bird {
    void printName(Bird b) {
        System.out.println("Bird");
    }
}

class ForestBird extends Bird {
    void printName(ForestBird bird) {
        System.out.println("Forest Bird");
    }
}

class Owl extends ForestBird {
    void printName(ForestBird bird) {
        System.out.println("Owl");
    }
}
