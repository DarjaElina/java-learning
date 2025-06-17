## Review of covered material

### Ternary Operator
```
    booleanExpression ? expression1 : expression2;
```

### Name Conflicts using Import statements
#### Name Conflict 1
```
    package p3;
    import p1.A;
    import p2.A; // ❌ error here
    class B {}
```

#### Name Conflict 2
```
    package p3;
    import p1.*;
    import p2.*;
    class B {
        A a = new A(); // ❌ error here
    }
```

#### Semi-Correct Version
```
    package p3;
    import p1.A;
    import p2.*;
    class B {
        A a = new A(); // 🤔 okay, no error, but unclear
    }
```

#### Correct Version
```
    package p3;
    import p1.*;
    import p2.*;
    class B {
        p1.A a = new p1.A(); // ✅ good
        p2.A a = new p2.A(); // ✅ good
    }
```

### Garbage Collection. Methods System.gc() & finalize()

#### System.gc()
- located in the java.lang package
- calling System.gc() sends a request to the JVM, suggesting that it might be a good time to run garbage collection
- But it does not force the GC to execute immediately

#### finalize()
The finalize() method in Java is called by the Garbage Collector just before an object is destroyed.

### Access Modifiers
- _public_ class elements with _default_ access modifiers are not accessible inside classes of another package

### Constructors
- Object of _public_ class cannot be created in class of another package using default constructor
- The Default constructor has the same access modifier as its class
- Compiler does not allow creating recursive constructor

### Methods
- Making constructor a method by adding a return type
- The Name of method and instance variable can be the same
- Parameters of overloaded methods can be both primitive and reference data types
- When calling method that requires int as a parameter type, we can use char type.

### Return keyword




