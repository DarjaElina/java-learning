## Interfaces in Java
```java
interface Jumpable {
    void jump(int meters);
    int CONSTANT = 2;
}
```

```java
class Animal implements Jumpable {
    public void jump() {
        System.out.println("Animal can jump");
        System.out.println("Number: " + CONSTANT);
    }
}
```
> Interfaces can only have **constant** variables 👆

By default, compiler does:

```java
interface Jumpable {
    void jump(int meters);
    public final static int CONSTANT = 2;
}
```

We cannot change these variables inside classes that implement interfaces.
> Usually we don't use variables inside interfaces.

Interfaces are usually compared with **contracts**.

Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler. If your class claims to implement an interface, all methods defined by that interface must appear in its source code before the class will successfully compile.

### Interface Rules
- We cannot create an object from an interface, because it is not a class
- Interface does not have a constructor
- Access modifier of top-level interfaces is **either** public or **default**

If class implements multiple interfaces, it can use their overloaded methods:
#### This is OK ✅, we use overloaded methods with different parameters
```java
interface I1 {
    void abc(int a);
}
interface I1 {
    void abc(String s);
}
class Test implements I1, I2 {
    public void abc(int a) {
        //some code
    }
    public void abc(String s) {
        //some code
    }
}
```

#### This is not OK ❌, here methods differ only by return type and cannot be overloaded
```java
interface I1 {
    void abc(int a);
}
interface I1 {
    int abc(int a);
}
class Test implements I1, I2 {
    public void abc(int a) {
        //some code
    }
    public int abc(String s) {
        return 5;
    }
}
```

### Class & Interface Inheritance
- Class can inherit zero or one classes using keyword **extends**
- Class can implement zero or more interfaces using keyword **implements**
- Class cannot inherit interface
- Interface cannot inherit or implement class
- Interface can inherit zero or more interfaces using keyword **extends**
- Concrete class can inherit concrete or abstract class
- Abstract class can inherit concrete or abstract class and implement interface