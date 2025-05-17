package Lesson9;

public class Car {
    String color;
    String engine;
    static int count;

    Car(String color, String engine) {
        Car.count++;
        this.color = color;
        this.engine = engine;
    }

    public static void changeEngine(String newEngine) {
        // this.engine = newEngine; => error; this cannot be referenced from a static context

        // the only way we can change engine inside static method is by creating an object
        // then engine value will be changed only for this particular object created inside method
        Car newCar = new Car("red", "V8");
        newCar.engine = newEngine; // this works fine
    }

    public void showColor() {
        System.out.println("Car color: " + color);
        // int a = price; => cannot use local variable outside its scope
        changeColor("pink");
    }

    public void changeColor(String newColor) {
        System.out.println("Car color changed to: " + newColor);
        int price = 5000;
        color = newColor;
        price += 1000;
    }

    public static void main(String[] args) {
        Car car = new Car("red", "V8");
        System.out.println(car.color);
        car.changeColor("pink");
        System.out.println(car.color);
    }

    // int a = price; => cannot use local variable outside its scope
}
