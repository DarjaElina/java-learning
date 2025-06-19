package Lesson23;

public class Binding3 {
    public static void main(String[] args) {
        Plant plant = new Cactus();
        // trying to call overridden private method,
        // we might think that runtime binding will happen 👇
        // plant.produceOxygen(); ❌ but we get compiler error


        // trying to call "overridden" static method
        plant.bloom(); // prints "I am blooming 🌸"
        // here happens compile time binding ❗️
    }
}

class Plant {
    String name;
    private int age;
    public void grow() {
        System.out.println("I am growing 🌱");
    }
    public void drinkWater() {
        System.out.println("I am drinking water");
    }

    // private method, what if we try to override it? 🤔
    private void produceOxygen() {
        System.out.println("I produce oxygen");
    }

    // static method
    static void bloom() {
        System.out.println("I am blooming 🌸");
    }
}

class Cactus extends Plant {
    public void drinkWater() {
        System.out.println("I don't drink too much water 🌵");
    }

    // looks good so far. 🤔
    // ❗️ but we didn't override the method, we actually created a new method
    public void produceOxygen() {
        System.out.println("I produce oxygen too 🌵");
    }

    // did we override bloom() method from Plant class? 🤔
    static void bloom() {
        System.out.println("I am blooming too! 🌵🌸");
    }
    // actually, no!
    // it's called method hiding


}

class Moss extends Plant {
    public void growOnWalls() {
        System.out.println("I can grow on walls 🌿");
    }
}