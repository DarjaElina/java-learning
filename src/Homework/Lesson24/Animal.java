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

class Penguin extends Bird {
    Penguin(String name) {
        super(name);
    }

    void eat() {
        System.out.println("Penguin like to eat fish");
    }

    void sleep() {
        System.out.println("Penguins can sleep sleep standing up");
    }
    void fly() {
        System.out.println("Penguins cannot fly");
    }
    public void speak() {
        System.out.println("Penguins cannot sing like nightingales");
    }
}

class Lion extends Mammal {
    Lion(String name) {
        super(name);
    }

    void eat() {
        System.out.println("Lion, like any other predator, eats meat");
    }

    void sleep() {
        System.out.println("Lion spends 16-20 hours a day sleeping");
    }
    void run() {
        System.out.println("Lions are not the fastest cats");
    }
}

class Main {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Mechenosec");
        m.eat();
        m.swim();
        m.sleep();

        Speakable p = new Penguin("Penguin");
        p.speak();

        Animal a = new Lion("Scar");
        System.out.println(a.name);
        a.eat();
        a.sleep();

        Mammal mL = new Lion("Simba 🦁");
        System.out.println(mL.name);
        mL.eat();
        mL.sleep();
        mL.speak();
        mL.run();
    }
}