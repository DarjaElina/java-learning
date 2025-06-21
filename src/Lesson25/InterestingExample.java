package Lesson25;

public class InterestingExample {
}

class Car {
    static int speed = 30;
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.speed);
        car = null;
        System.out.println(car.speed); // 🤯 still 30 🤔
        // Why?
        // because speed is static
    }
}
