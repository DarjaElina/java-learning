package Homework.Lesson24;

abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
      super(name);
    }

    void sleep() {
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi. 🐟");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
    }

    abstract void fly();

    public void speak() {
        System.out.println(name + "sings");
    }
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
    }
    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Speaking...");
    };
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
    }

    void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavayet!");
    }
    void eat() {
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
    }
}