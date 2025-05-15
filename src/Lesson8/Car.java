package Lesson8;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
}

class Human {
    String name = "John";
    Car car = new Car("red", "V12");
    final Car car2 = new Car("red", "V12");

    public static void main(String[] args) {
        Human human = new Human();
        human.car = new Car("pink", "V6");
        human.car.engine = "v9";
        // human.car2 = new Car("green", "V8"); // => compiler error, Cannot assign a value to final variable 'car2'
    }
}
