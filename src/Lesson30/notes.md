## Lambda Expressions
A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

### Syntax
> (parameter1, parameter2) -> { code block }

```
methodName(() -> 5);
methodName((x) -> x.length);
methodName((String x) -> x.length());
methodName((x, y) -> x.length());
methodName((String x, String y) -> x.length());
```

### Interface Predicate
Lambda expressions work with interfaces that have only one method. This kind of interfaces is called **functional interfaces**.

### Syntax
```java
public interface Predicate<T> {
    boolean method(T t);
}
```

- Interface Predicate<T> lives inside **java.util.function** package
- Method removeIf() if class ArrayList uses Predicate<T> as parameter 👇
```
boolean removeIf(Predicate filter)
```