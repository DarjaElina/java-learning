## ✨ Object Oriented Programming
Object-oriented programming (OOP) is a way of structuring a program by organizing its code into reusable "objects."

### OOP Concepts

1) Encapsulation
2) Inheritance
3) Polymorphism

### Encapsulation
Encapsulation means wrapping data and code (that works on the data) into one unit, like a capsule.

#### To achieve encapsulation in Java:

- Declare the class variables as private.
- Provide public getter and setter methods to access and update the value of a private variable.

#### ❗️ Note about getters
> If return type of get() if mutable, then it is better to return its **copy**


### Inheritance
```java
    class Parent {
    // some code
    }
    class Child extends Parent {
    // some code
    }
```

In this example 👆, we can call Child class:
- Derived class
- Child class
- Subclass
- Extended class

We can call Parent class:
- Super class
- Parent class
- Base class

#### Why we need inheritance
- Reusability
- Modularity
- Reduce code duplication
- Extensibility

### Relationships between classes
#### "Is - a" relationship:
```java
    class Animal {}
    class Cat extends Animal {}
```
A Cat **is** **an** Animal
#### "Has - a" relationship 
```java
    class Window {}
    class House {
        Window w = new Window();
    }
```
House **has** **a** Window

### Class Object
Class Object is a parent of every class in Java. It is the only class that does not have a parent.

### What can be inherited
1) Elements with **public** access modifier
2) Elements with **default** access modifier, **only** if child class is in the same package as parent class

Elements with **private** access modifier cannot be inherited, but their getters and setters can.

#### Protected access modifier
Allows access within the same package and by child classes, even if they are in different packages.

> ❗️ Constructors cannot be inherited


### Keyword "super" in constructor
```java
    class X {
        public X(String s) {
            System.out.println(s);
        }
    }
    
    class Y extends X {
        public Y() {
            super("Parent constructor is called");
            System.out.println("Hello");
        }
    }
```

- **super** keyword calls constructor of a superclass, which always finish executing before the child class's constructor
- **super** must be of the first line of constructor
- If we are not using **super**, compiler will add it by default, calling the default parameter of the parent class
- **this** and **super** cannot be in the constructor body at the same time