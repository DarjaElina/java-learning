## The most common subclasses of Error
- ExceptionInitializerError
- StackOverflowError
- OutOfMemoryError
- NoClassDefFoundError

## Exceptions, method overriding and overloading & constructors
If a method **overrides another method from superclass** or **implements one from interface**, we **must not** add new checked exceptions to its signature

We can only use exceptions from superclass overridden method or this exception's subclasses

Constructor cah throw errors. It must define all exceptions thrown by its superclass constructor, their superclasses and add new exceptions.
