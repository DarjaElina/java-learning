## Generics
Generics means parameterized types. The idea is to allow a type (like Integer, String, etc., or user-defined types) to be a parameter to methods, classes, and interfaces. Generics in Java allow us to create classes, interfaces, and methods where the type of the data is specified as a parameter. If we use generics, we do not need to write multiple versions of the same code for different data types.
### Generics give us:
- Type Safe & Reusable Code

### Generic or Parameterized class

```java
public class Box<T> {
   private T t;
}
```
- Box − Box is a generic class.
- T − The generic type parameter passed to generic class. It can take any Object.
- t − Instance of generic type T.

### Generic methods
```java
static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
    for (T o : a) {
        c.add(o);
    }
}
```

### Type Erasure
Type erasure is the process where Java removes generic type information at compile time.

This is how Java makes generics compatible with older (pre-1.5) versions of Java, which didn’t have generics at all.

Type Erasure can cause problems with method overloading