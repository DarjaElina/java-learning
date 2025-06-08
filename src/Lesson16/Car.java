package Lesson16;

public class Car {
    String color;
    String engine;
    Car (String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    final static int a = 5;
    //a = 10;

    public Car createV10Car(String color) {
        Car c10 = new Car(color, "V10");
        return c10;
    }

    public static void main (String[] args) {
        Car c = new Car("Red", "V10");
        Car c2 = c.createV10Car("Black");
        System.out.println(c.color);
    }
}