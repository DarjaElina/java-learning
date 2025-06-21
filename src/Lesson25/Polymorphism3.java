package Lesson25;

class UnrelatedToAnimal {
    String breed = "doge";
}

public class Polymorphism3 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Walkable walkable = new Duck();

        Animal dog = new Dog("husky");
        Animal duck = new Duck();
        Animal tiger = new Tiger();

        // System.out.println(dog.breed); // not allowed ❌
        // but we know that dog IS a dog, so it has breed field 🤔
        // what can we do?
        // Cast! 👇
        System.out.println(((Dog) dog).breed); // ✅ all good
        ((Duck) duck).quack();

        // but we cannot do type cast with objects that do not have "is - a" relationship
        // System.out.println(((UnrelatedToAnimal)duck).breed); ❌

        // we can cheat. 👇
        // ((Duck)animal3).quack(); // even though animal 3 is actually a Tiger, and it cannot be cast to Duck, this code will compile
        // but throw a runtime exception 💥
        // class Lesson25.Tiger cannot be cast to class Lesson25.Duck

        // same with interfaces
        walkable.walk();
        // w.quack(); ❌ compiler error
        ((Duck)walkable).quack(); // ✅ all good

        // comparison works with objects that have "is - a" relationship
        System.out.println(tiger == animal);
        System.out.println(duck == animal);
        System.out.println(dog == animal);
        System.out.println(walkable == animal);

        // this will not work
        UnrelatedToAnimal unrelatedToAnimal = new UnrelatedToAnimal();
        //System.out.println(unrelatedToAnimal == animal); // ❌ compiler error

        // but we can use equals()
        System.out.println(animal.equals(unrelatedToAnimal)); // ✅ okay, just prints false

    }
}

class Animal {
    String name;
    int age;

    void eat() {
        System.out.println("Animal eats");
    }
    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal {
    String breed;
    Dog(String breed) {
        this.breed = breed;
    }
    void bark() {
        System.out.println("Dog barks");
    }
}

class Duck extends Animal implements Walkable {
    String featherColor;
    void quack() {
        System.out.println("Duck quacks");
    }
    public void walk() {
        System.out.println("Duck walks");
    }
}

class Tiger extends Animal {
    int stripes;
    void roar() {
        System.out.println("Rrr...🐯");
    }
}

interface Walkable {
    void walk();
}