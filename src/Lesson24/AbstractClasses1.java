package Lesson24;

public class AbstractClasses1 {
    public static void main(String[] args) {
        // we cannot create objects from abstract classes 👇
        // Shape s = new Shape(); ❌ 'Shape' is abstract; cannot be instantiated

        // but we can use reference on abstract class to create instances of its non-abstract subclasses
        Shape shape = new Circle();
        System.out.println(shape.numberOfSides); // 0, static binding (we use a field)
        shape.perimeter(); // dynamic binding, overridden method
    }
}

// if someone asked us to draw a shape,
// what would we draw?
// a square? a triangle? a circle?
// the word "shape" is too vague, it's a general concept, not something specific we can draw.
// That’s why Shape should be an abstract class, it represents the idea ❗️ of a shape
abstract class Shape {
    // abstract class constructor
    Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    Shape() {}
    int numberOfSides = 0;


    // normal, not abstract method
    void showInfo() {
        System.out.println("This is a shape");
    }

    // abstract methods do not have bodies
    abstract void perimeter();
    abstract void area();
}

// we would have to override methods and hide variable for each of these classes. 👇
// Shape does not know what happens inside methods that are common for its children
// it only knows that these methods exist

// class inherited from abstract class must implement all abstract methods of its superclass. ❗️
class Square extends Shape {
    Square(int numberOfSides) {
        super(numberOfSides);
        this.numberOfSides = numberOfSides;
    }
    int numberOfSides = 4;
    int sideLength;
    void perimeter() {
        System.out.println("Perimeter of a square: " + sideLength * numberOfSides);
    }
    void area() {
        System.out.println("Area of a square: " + sideLength * sideLength);
    }
}

class Rectangle extends Shape {
    int numberOfSides = 4;
    int firstSideLength;
    int secondSideLength;

    public void perimeter() {
        System.out.println("Perimeter of a rectangle: " + 2 * (firstSideLength + secondSideLength));
    }

    public void area() {
        System.out.println("Area of a rectangle: " + firstSideLength * secondSideLength);
    }
}


class Circle extends Shape {
    int numberOfSides = 0;
    int radius = 10;

    void perimeter() {
        System.out.println("Perimeter of a circle: " + 2 * 3.14 * radius);
    }

    void area() {
        System.out.println("Area of a circle: " + 3.14 * radius * radius);
    }
}



// OR be declared abstract 👇
abstract class Quadrilateral extends Shape {
    void def() {
        System.out.println("This is a four-sided figure.");
    }
}
