## Switch statement

### Syntax
```
switch (expression) {
    case value1:
        our code;
        break;
    case value2:
        our code;
        break;
    case value3:
        our code;
        break;
    default:
        our code;
        break;
}
```

### Data type of switch expression
```
    switch (expression) {}
```
> ❗️Expression here cannot be of any data type

#### It can be:
- byte
- short
- int
- char
- String

### Compile time constants
For example:
- 1
- -3.14
- "Hello World"
- 5 * 10
#### What is NOT a compile time constant
For example:
```
    int a = 5;
    int b = 10;
    
    a * b; // this is not a compile time constant
```

#### We can fix that using **final** modifier
```
    final int a = 5;
    final int b = 10;
    
    a * b; // works fine
```

#### BUT this will not work
```
    final int a;
    a = 5;
    final int b;
    b = 10;
    
    a * b;
```
