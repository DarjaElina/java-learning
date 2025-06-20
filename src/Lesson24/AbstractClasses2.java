package Lesson24;

public class AbstractClasses2 {
}

abstract class Vehicle {
    String color;
    int speed;

    // All vehicles need to move, but how exactly depends on the vehicle type
    abstract void move();

    // we cannot have:
    // final abstract void park() {} ❌ Illegal combination of modifiers 'abstract' and 'final'
    // static abstract void park() {} ❌ Illegal combination of modifiers 'abstract' and 'static'
    // private abstract void park() {} ❌ Illegal combination of modifiers 'abstract' and 'private'

    // Why?
    // final and static methods cannot be overridden,
    // private methods are not accessible outside the class
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car drives on the road.");
    }
}

class Boat extends Vehicle {
    @Override
    void move() {
        System.out.println("The boat sails on water.");
    }
}

