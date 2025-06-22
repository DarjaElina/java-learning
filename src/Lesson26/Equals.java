package Lesson26;
import java.util.ArrayList;
class NotACar {}

public class Equals {
    public static void main(String[] args) {
        Car car1 = new Car("red", "V4");
        Car car2 = new Car("red", "V4");
        Car car3 = new Car("black", "V8");
        NotACar notACar = new NotACar();
        Object objectCar = new Car("black", "V8");

        System.out.println(car1 == car2); // false, they refer to different objects
        System.out.println(car1.equals(car2)); // true, but only after we override equals()
        System.out.println(car3.equals(objectCar)); // true
        System.out.println(car1.equals(notACar)); // false

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        // ArrayList has some methods that use equals() under the hood,
        // for example, contains

        Car car4 = new Car("black", "V8");
        System.out.println("Cars contain car4 = " + cars.contains(car4));

        System.out.println(car1.equals(null)); // ✅ good, prints false, but...
        car2 = null;
        System.out.println(car2.equals(car4)); // = null.equals(car4), 💥 Runtime Exception
        // we cannot call equals() on null


    }
}


class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    // default equals()
//    public boolean equals (Object obj) {
//        return (this == obj);
//    }


     // correctly overridden method
    @Override
    public boolean equals (Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return (color.equals(car.color) && engine.equals(car.engine));
        } else {
            return false;
        }
    }

//     common mistake, when defining our own equals()
//     this method will not override default equals,
//     because default equals() accepts Object as a parameter type
//     this is just new method 👇
//    public boolean equals(Car car) {
//        return (color.equals(car.color) && engine.equals(car.engine));
//    }
}


