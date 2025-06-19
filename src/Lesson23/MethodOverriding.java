package Lesson23;

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat(); // I can eat
        Wolf wolf = new Wolf();
        wolf.eat(); // I cat eat rabbits
        Giraffe giraffe = new Giraffe();
        giraffe.eat(); // I can eat trees. 🌳
    }
}

class Animal {
    String name;
    String group;
    String habitat;
    int age;

    Food eat() {
        System.out.println("I can eat");
        return new Food();
    }
    void sleep() {
        System.out.println("I can sleep");
    }
}

class Wolf extends Animal {
    void howl() {
        System.out.println("AWOOOO! 🐺");
    }

    // method overriding
    // ❗️ public access modifier
    // it must be same or less strict here than in Animal if we want overridden methods,
    // for example, private would throw compiler error ❌
    public Food eat() {
        System.out.println("I cat eat rabbits");
        return new Food();
    }
}

class Giraffe extends Animal {
    int horns = 2;
    void beTall() {
        System.out.println("I am tall 🦒");
    }

    // also method overriding
    // using @Override annotation
    @Override
    Tree eat() {
        System.out.println("I can eat trees. 🌳");
        return new Tree();
    }
}

class Food {}
class Tree extends Food {}
