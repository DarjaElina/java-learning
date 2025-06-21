## Primitive Data Types Casting
With primitives, we usually call type casting **widening**

### 19 Forms of Widening
- byte to short, int, long, float or double
- short to int, long, float or double
- char to int, long, float or double
- int to long, long, float or double
- long to float or double
- float to double

### Narrowing

Narrowing without casting happens when:
1) If int cast to byte, short or char
2) If int is a constant
3) If value of int is in range of a chosen data type

### 22 Forms of Narrowing
- short to byte of char
- char to byte of short
- int to byte, short or char
- long to byte, short, char or int
- float to byte, short, char, int or long
- double to byte, short, char, int, long or float

### Numeric Promotion
Happens when:
- Java automatically converts smaller numbers to larger
- Java automatically converts whole numbers to decimal
- If we perform arithmetic operations on **byte**, **short** and **char**, they get converted to **int** (even if we don't have int itself there)

❗️Exception: unary operators