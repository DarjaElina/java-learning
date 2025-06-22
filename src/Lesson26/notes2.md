### Wrapper Classes
Wrapper classes provide a way to use primitive data types as objects.

#### Autoboxing
Converting primitives to the corresponding wrapper class

#### Unboxing
Converting a wrapper class object to the corresponding primitive

#### parse()
parse() converts String value to the corresponding primitive

#### valueOf()

The valueOf() method returns the corresponding wrapper class representation of the argument passed.
- String.valueOf()
- Integer.valueOf()

### Method Priority for Overloaded Methods

If we have a method call that matches multiple overloaded methods, priority is the following:
1) Exact match of data types
2) Larger data types for primitives and parent classes for reference data types
3) Autoboxed data types
4) Varargs
