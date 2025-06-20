## Abstract Classes and Methods in Java
```java
abstract class Shape {
    public void notAbstractMethod() {
        // some code
    }
    
    abstract int area(); // abstract method with no method body
}
```

#### Abstract Methods Rules
- Abstract methods do not have bodies
- We cannot create an object from abstract class
- We cannot create abstract methods inside non-abstract classes
- But abstract class **may** or **may not** contain abstract methods
- Subclass must override every abstract method of superclass OR also be abstract
- We can use reference of an abstract class to create instances of non-abstract subclass. 👇
```java
    abstract class Vehicle {}
    class Car extends Vehicle {}

    public class Main {
        public static void main(String[] args) {
            Vehicle v = new Car(); // ❗️ here
        }
    }
```
- Abstract class cannot be final (final class cannot be inherited)
- Variables cannot be abstract, only classes or methods
- Abstract classes have constructors
- Methods **cannot** be: **final abstract, private abstract, static abstract** .

### Reminder about Compile Time Binding
Compile-Time Binding = Static Binding:
This happens when:
- The compiler knows at compile time exactly what it’s dealing with.

Applies to:
- Fields (variables) → like numberOfSides
- Static methods
- Private methods
- Final methods