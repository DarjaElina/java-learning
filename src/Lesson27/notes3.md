## try/catch/finally

```
try {
    // some code
} catch (Exception_1 e) {
    // some code
} catch (Exception_2 e) {
    // some code
}
    ......
catch (Exception_n e) {
    // some code
}
finally {
    // some code
}
```

### Subclasses of RuntimeException = unchecked exceptions

- Runtime exceptions are usually just buggy code. 🐛
- We as programmers are responsible for them.
- Compiler **cannot** check the possibility of throwing runtime exception and cannot force us to use try/catch

### Subclasses of Exception = checked exceptions
- Checked exceptions points to code that are not directly controlled by our program
- We as programmers cannot control them
- They can happen when interacting with filesystem, DB, network...
- Compiler will always check for the possibility of checked exceptions