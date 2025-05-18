## Control Flow Statements

In Java, flow control statements dictate the order in which instructions are executed, enabling developers to manage the program's execution path based on specific conditions or repetitions.

- Selection
- Looping

### Method equals()
When comparing reference data types
```
   String s1 = new String("Hello");
   String s1 = new String("Hello");
   System.out.println(s1 == s2);
```

> The program above will always print **false**, even the strings ARE equal. 
> But variables s1 and s2 store not actual strings, but ADDRESSES of their location in memory.

#### Correct way of comparing Strings using equals()
```
   String s1 = new String("Hello");
   String s1 = new String("Hello");
   System.out.println(s1.equals(s2));
```

### Ternary Operator
```
    (boolean expression) ? (if true) : (if false)
```