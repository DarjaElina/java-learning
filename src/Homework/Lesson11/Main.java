package Homework.Lesson11;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("red", "V8", 1);
        Car car2 = new Car("blue", "V8", 1);

        System.out.println(car1.amountOfDoors);
        System.out.println(car2.amountOfDoors);

        Car.changeAmountOfDoors(car1, 2);
        Car.changeAmountOfDoors(car2, 2);

        System.out.println(car1.amountOfDoors);
        System.out.println(car2.amountOfDoors);

        System.out.println(car1.color);
        System.out.println(car2.color);

        Car.swapColors(car1, car2);

        System.out.println(car1.color);
        System.out.println(car2.color);
    }
}
