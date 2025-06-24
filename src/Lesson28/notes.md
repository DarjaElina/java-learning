## Exceptions Part 2

### Notes about try/catch/finally
- **Finally** block will run even if we have return statements in **try** and/or **catch** blocks
- **Finally** will not run only if we use **System.exit** in **try** or **catch**, or if JVM or OS crashes
- If we have **return** inside both **catch** and *finally**, method will use return from **finally**
- If **catch** returns primitive, we cannot change it inside finally (without using another return there)
- If **catch** returns reference data type **and** this data type is mutable, we can change it inside **finally**
- Exception can be **rethrown**: usually we need that when we handle the exception only partially
- We can use nested try/catch/finally

## The most common subclasses of RuntimeException
- IndexOutOfBoundsException
- ArithmeticException
- ClassCastException
- IllegalArgumentsException
- IllegalStateException
- NullPointerException
- NumberFormatException