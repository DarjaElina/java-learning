## Types of Reference variables and objects

```java
class Animal {}
class Mouse extends Animal {}

class Main {
    public static void main(String[] args) {
        Animal animalMouse = new Mouse(); 
        // ✅ works well because Mouse Is Animal
    }
}
```

❗️If instance of superclass references to instance of subclass, we can only call **methods of superclass** on it. ❗️

## Method Overriding
Method overriding is a fundamental concept in Object-Oriented Programming (OOP) that **enables a subclass to provide a specific implementation of a method that is already defined in its superclass.**
> ❗️ final and static methods cannot be overridden

### Methods can be considered overridden if they are:
- Have same names in superclass and subclass
- Arguments count and types are the same
- Access modifier is the same or less strict in subclass
- Subclass method must be non-static
- Return types are the same
- Or return type in subclass method is subclass of a return type in superclass method (😑🤔) 👇

```java
class Food {}
class CatFood extends Food {}

class Animal {
    Food eat() {
        System.out.println("I eat food");
        return new Food();
    }
}

class Cat extends Animal {
    CatFood eat() {
        System.out.println("I eat cat food");
        return new CatFood(); // overridden methods, because CatFood is a subclass of Food 
    }
}
```


### Binding
Polymorphism allows an object to take multiple forms – when a method exhibits polymorphism, the compiler has to **map the name of the method to the final implementation.**
Or in simple terms:
> Binding = deciding which method to actually run.
> Java needs to bind a method call to a real method that lives somewhere in a class.

#### Compiler Time Binding
Also called **Early Binding** or **Static Binding**.
- private methods
- static methods
- final methods
All these methods 👆 **cannot** be overridden 

#### Run Time Binding
Also called **Late Binding** or **Dynamic Binding**.
- All other methods
> All variables have **compile time** binding.

### Method Hiding
If a subclass defines a static method with the same signature as a static method in the superclass, then the method in the subclass hides the one in the superclass.

The subclass defines another version of the same method name, which hides (shadows) the parent one when accessed via the subclass.

> When we call a static method, Java uses the type of the variable (or class name) to decide which method to call, not the actual object. ❗️

#### Methods can be considered hidden if:
- They have same names in subclass and superclass
- Arguments count and types are the same
- Access modifier is the same or less strict in subclass
- Return types are the same
- Or return type in subclass method is subclass of a return type in superclass method
- Both methods are static

### Variable hiding
Instance variable hiding refers to a state when instance variables of the same name are present in superclass and subclass.


### What can be overridden:
- All methods that are not **static, final or private**

### What can be hidden
- Static methods
- Non-private variables

### What cannot be neither overridden nor hidden
- Private methods and variable
- Final methods

> We can use **@Override** annotation when overriding method