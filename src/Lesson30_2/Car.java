package Lesson30_2;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

class ConsumerAndSupplier {
    public static ArrayList<Car> createCars(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList ourCars = createCars(() -> new Car("Nissan Tiida", "Silver Metallic", 1.6));
        System.out.println(ourCars);

        Car volvo = new Car("Volvo", "Silver Metallic", 1.6);
        System.out.println(volvo);

        // option 1, used more often
        changeCar(volvo, car -> {
            car.color = "Pink";
            car.engine = 2.0;
            System.out.println("Updated car: " + car);
        });

        // option 2, rarely used
        Consumer<Car> carConsumer = (car) -> {
            car.color = "Blue";
            car.engine = 2.5;
            System.out.println("Updated car: " + car);
        };

        carConsumer.accept(volvo);
    }
}

public class Car {
    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "🚗 Our car: " + model + ", color: " + color + ", engine: " + engine;
    }
}
