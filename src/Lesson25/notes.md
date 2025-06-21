## Polymorphism

Objects in java are considered polymorphic if they have **more than one** "is - a" connection.

Polymorphism is a method's ability to behave differently depending on from which class's instance it is called.

Overridden methods are often called polymorphic

### instanceof
instanceof is a binary operator we use to test if an object is of a given type.

```java
class Main {
    Car c = new Car();
    public static void main(String[] args) {
        System.out.println(c instanceof Object); // true
    }
}
```

instanceof checks if there is an "is - a" relationship between an object and class/interface.

If "is - a" relationship is impossible, compiler will throw an error. 🤔

### Reference data types casting
In Java, typecasting is the process of converting one data type to another data type using the casting operator

Casting is possible **only** if there is "is - a" relationship between classes/interfaces

- Casting from subclass to superclass is called **upcasting** and happens automatically
- Casting from subclass to superclass is called **downcasting** and do not happen automatically

