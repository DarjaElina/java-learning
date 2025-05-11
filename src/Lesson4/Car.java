package Lesson4;

public class Car {
    String color = "red";
    String engine = "V6";
}

class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = car1;
        // car2 stores the same memory address as car1

        System.out.println(car1.engine);

        System.out.println(new Car().color);
    }
}
