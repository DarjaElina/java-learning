## Method Overloading

If we have multiple methods with same name, Java can distinguish between them by 2 things:
- Number of parameters
- Type of parameters

#### By parameters' data types
```
void method(int a, String b) {}
void method(double a, boolean b) {}
```

#### By number of parameters
```
void method(int a, int b) {}
void method(int a, int b, int c) {}
```

### Rules of Overloading

- Return type can be same **or** different
- Access modifiers can be same **or** different (keywords that determine the scope and visibility of classes, methods, variables, and constructors within an application)
- Methods that are different **only** by return type or access modifier are not overloaded and will give compiler error

### Constructor overloading

Same idea: we can have multiple constructors with the same name, but with different number and types of parameters.

#### By parameters' data types
```
Constructor (int a, String b) {}
Constructor (double a, boolean b) {}
```

#### By number of parameters
```
Constructor (int a, int b) {}
Constructor (int a, int b, int c) {}
```

### This

- Constructor cannot call overloaded constructor inside its body
#### Compiler error:
```
Constructor (int a) {}
Constructor (int a, int b) { Constructor (5); }
```
- We need to use **this** keyword **on the first line** inside constructor body
- #### This is correct
```
Constructor (int a) {}
Constructor (int a, int b) { this(5); }
```
