## Default methods of Interface

```java
interface Jumpable {
    default void jump() {
        System.out.println("Jump");
    }
}
```
> ❗️ This default has nothing to do with access modifiers.

Access modifiers of default methods is **public**.

- Default methods must have a body
- Default methods cannot be static, final or abstract

### Static methods in interfaces