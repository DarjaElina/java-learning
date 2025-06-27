## Lambda Expressions. Part 2
## Functional Interfaces
### Consumer & Supplier
- Consumer is a functional interface that takes in a value and returns nothing. It has the method void accept(T t).

- Supplier is a functional interface that takes no arguments and returns a value. It has the method T get().

They are often used in lambda expressions to perform actions (Consumer) or provide values (Supplier) without needing a full class.

### Some methods that use lambda expressions
- forEach()
- removeIf()
- sort()

### Scope of variables in lambdas