package Homework.Lesson9;

public class Cat {
    private String name;
    public String color;
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

class Main {
    public static void main(String[] args) {
        // creating 8 objects
        Cat cat = new Cat("Whiskers", "black");
        Cat cat2 = new Cat("Mochi", "white");
        Cat cat3 = new Cat("Luna", "red");
        Cat cat4 = new Cat("Simba", "black");
        Cat cat5 = new Cat("Mirri", "white");
        Cat cat6 = new Cat("Pumpkin", "black");
        Cat cat7 = new Cat("Shadow", "gray");
        Cat cat8 = new Cat("Pig", "black and white");
        Cat cat9 = new Cat("Mittens", "white and red");

        cat = cat2; // object cat becomes eligible for deletion
        cat3 = null; // object cat3 becomes eligible for deletion
        cat4 = null; // object cat4 becomes eligible for deletion
        cat8 = cat9; // object cat4 becomes eligible for deletion
        cat9 = null; // object cat9 becomes eligible for deletion
        cat2 = cat5; // object cat5 becomes eligible for deletion
        cat7 = null; // object cat5 becomes eligible for deletion

        // only 2 objects remain
    }
}