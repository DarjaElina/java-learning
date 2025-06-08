### Class String

#### Creating String in Java
1) ```
    String s1 = new String("Hello");
   ```
2) ```
   String s2 = "Hello";
   ```
   
#### String Pool (String constant pool)
String pool is a storage space in the Java heap memory where string literals are stored.

#### Strings in Java are immutable
- You can’t change a single character inside a String.
- Strings do use an internal char[] array to store characters.
- But that array is private and final, and there's no way to reach into it and modify it.
```
    String s = "Hello";
    s[0] = 'Y'; // ❌ illegal
    s.setCharAt(0, 'Y'); // ❌ no such method in String
```

#### String Equality
1) ==
2) !=
3) method equals()
4) method equalsIgnoreCase()