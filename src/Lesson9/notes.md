## Variable Types and Scope

#### 1. Local Variable
- Declared inside a method, constructor, or block ({}).
- Scope: From the line it's declared → to the end of the block/method.
- Used temporarily during method execution.

```
    void example() {
        int x = 5; // local variable
        System.out.println(x);
    }
```
#### 2. Parameter
- Passed into a method or constructor.
- Behaves like a local variable but gets its value from outside.

```
    void greet(String name) {  // 'name' is a parameter
        System.out.println("Hi " + name);
    }
```
#### 3. Instance Variable (also called field or non-static member variable)
- Declared in the class, but outside any method.
- Belongs to each object (instance) of the class.
- Requires creating an object to access it.
```
    public class Person {
    String name;  // instance variable

        public Person(String name) {
            this.name = name;
        }
    }
```
#### 4. Static Variable

- Declared with static keyword in a class (outside methods).
- Belongs to the class itself, not to any specific object.
- Shared across all instances.

```
    public class Counter {
    static int count = 0;  // static variable

    public Counter() {
        count++;  // every time a new object is created, count increases
    }
}
```

### This Keyword

- **this** keyword is a reference variable that refers to the current object
- We cannot use **this** inside static methods or when assigning value to a static variable

### Carbage Collector

Garbage collection in Java is an automatic memory management process that helps Java programs run efficiently. Java garbage collector automatically identifies and removes unused objects, freeing up memory in the heap.

- We can say which objects will be eligible for deletion
- But we cannot say when exactly garbage collector will remove them
- We cannot directly control garbage collector
- GC is controlled by JVM
