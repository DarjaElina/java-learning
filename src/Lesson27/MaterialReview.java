package Lesson27;

public class MaterialReview {
    public static void main(String[] args) {
        Cat cat = new Puma();
        System.out.println(cat.name); // cat
        System.out.println(cat.habitat); // habitat
        cat.meow(); // Non-Static Meow From Puma Class
        cat.purr(); // Static Purr From Cat Class
    }
}

class Cat {
    String name = "Cat";
    static String habitat = "Habitat";

    void meow() {
        System.out.println("Non-Static Meow From Cat Class");
    }

    static void purr() {
        System.out.println("Static Purr From Cat Class");
    }
}

class Puma extends Cat {
    String name = "Puma";
    static String habitat = "Forests, grasslands, and deserts";

    @Override
    void meow() {
        System.out.println("Non-Static Meow From Puma Class");
    }
    static void purr() {
        System.out.println("Static Purr From Puma Class");
    }
}