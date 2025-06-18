package Homework.Lesson22;

public class Animal {
    public Animal() {
        System.out.println("I am an Animal 🐾");
    }
    public int eyesCount;
    public void eat() {
        System.out.println("I can eat");
    }
}

class Pet extends Animal {
    int tailCount = 1;
    int pawCount = 4;
    public Pet(int eyesCount) {
        System.out.println("I am a pet");
        this.eyesCount = eyesCount;
    }

    public void run() {
        System.out.println("I can run");
    }
    public void jump() {
        System.out.println("I can jump");
    }
}

class Dog extends Pet {
    public String name;
    public Dog(String name) {
        super(2);
        this.name = name;
        System.out.println("🐶 I am a dog and my name is " + name);
    }
    public void play() {
        System.out.println("🐶 I can play");
    }
}

class Cat extends Pet {
    public String name;
    public Cat(String name) {
        super(2);
        this.name = name;
        System.out.println("🐱 I am a cat and my name is " + name);
    }
    public void sleep() {
        System.out.println("🐱 I can sleep");
    }
}
