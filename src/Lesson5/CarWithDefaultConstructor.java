package Lesson5;

import Lesson4.Car;

public class CarWithDefaultConstructor {
    String color;
    String engine;
    int speed;

    int accelerate(int amount) {
        return speed += amount;
    }

    int slowDown(int amount) {
        return speed -= amount;
    }

    void showInfo() {
        System.out.println("Color: " + color + ", Engine: " + engine + ", Speed: " + speed);
    }
}

class CarDefaultTest {
    public static void main(String[] args) {
        CarWithDefaultConstructor car = new CarWithDefaultConstructor();
        car.color = "red";
        car.engine = "V6";
        car.speed = 100;

        car.showInfo();
        car.accelerate(10);
        car.showInfo();
        car.slowDown(80);
        car.showInfo();
    }
}