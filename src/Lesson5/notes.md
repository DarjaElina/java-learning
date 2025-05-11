### Java Methods

A method in Java is a set of instructions that can be called for execution using the method name.
We can pass data (parameters), process it inside our method and return an output.
Methods are used to perform certain actions, and they are also known as functions.

#### Method Structure

```
    public static void main(String[] args) {our code}
```
1) **public** -> access modifier (optional, not required)
2) **static** -> non-access modifier (optional, not required)
3) **void** -> return type (required)
4) **method name** -> main (required)
5) **parameters** (String[] args) -> braces are required, parameters are optional
6) {our code} -> method body

#### Method creation
```
    int sum(int a, int b) {
        int result = a + b;
        return result;
    }
```

#### Method call

```
    int additionRes = sum(10, 5);
```

#### Method Overloading

Java determines which method to call based on:

- the number of parameters
- the types of parameters
- the order of parameters

This is called **compile-time polymorphism** or **static binding**, because Java decides which method to use during compilation.

#### Constructor

Constructor is a method for creating new class instances.
```
    Car car = new Car();
```

Constructor name is always the same as class name.

#### Constructor Types

- Default:
    - Created by compiler
    - Does not have parameters
    - Always has empty body
```
    public class Car {
        // this will be created by Java compiler, we do not write it
        Car(){}
    }
```
- User defined
    - Created by user
    - Can be with or without parameters
    - Can have empty or not empty body
```
     public class Car {
        String color;
        String engine;
        // this is a user defined constructor
        Car() {
            System.out.println("New car created!");
        }
        
        // this is also a user defined constructor
        Car() {
            color = "green";
            engine = "V8";
        }
    }
```

#### Difference between method and constructor

- Method
  - Always has a return type
  - The name can be anything
- Constructor
  - Does not have a return type
  - Name has to be the same as class name
