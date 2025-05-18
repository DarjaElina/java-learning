package Homework.Lesson11;

public class Car {
    public String color;
    public String engine;
    public int amountOfDoors;

    public Car(String color, String engine, int amountOfDoors) {
        this.color = color;
        this.engine = engine;
        this.amountOfDoors = amountOfDoors;
    }

    public static void changeAmountOfDoors(Car car, int amountOfDoors) {
        car.amountOfDoors = amountOfDoors;
    }

    public static void swapColors(Car car1, Car car2) {
        String temp = car1.color;
        car1.color = car2.color;
        car2.color = temp;
    }
}
