package Lesson5;

public class Car {
    // instance variables
    String color;
    String engine;

    // user defined constructor
    Car(String newColor, String newEngine) {
        color = newColor;
        engine = newEngine;
        System.out.println("Color: " + color + ", Engine: " + engine);
    }
}

class CarTest {
    public static void main(String[] args) {
        // this will be a compiler error, because default constructor is not created if we define our own
        // Car car = new Car();

        Car car = new Car("red", "V8");
        Car car1 = new Car("blue", "V12");
    }
}
