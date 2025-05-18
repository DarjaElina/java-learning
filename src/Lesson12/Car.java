package Lesson12;

public class Car {
    public int engine;
    public int doorCount;
    public boolean equals(Car car) {
        return this.engine == car.engine && this.doorCount == car.doorCount;
    }
    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}
