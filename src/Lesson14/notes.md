## Loops in Java
- regular for
- while
- do while
- foreach

### Regular for
```
    for (initialization ; condition ; update) {
        expressions;
    }
```
### Unreachable statement
> Java does not allow writing code with unreachable statements
```
    for (int i = 0; false; i++) {
        // some code
    }
```

#### We can name loops with labels
It will help to write complex code