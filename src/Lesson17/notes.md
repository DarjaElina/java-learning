### StringBuilder

In Java, the StringBuilder class is a part of the java.lang package that provides a mutable sequence of characters. Unlike String (which is immutable), StringBuilder allows in-place modifications, making it memory-efficient and faster for frequent string operations.

#### Creating StringBuilder Objects
1) ```
    StringBuilder sb1 = new StringBuilder();
   ```
2)  ```
    StringBuilder sb2 = new StringBuilder("Good Day!");
   ```
3) ```
    StringBuilder sb3 = new StringBuilder(50);
   ```
4) ```
    StringBuilder sb4 = new StringBuilder(sb2);
    ```
   

#### String Builder Methods

##### Same methods for String and StringBuilder
1) length() -> int
2) charAt(int index) -> char
3) - indexOf(String s) -> int
   - indexOf(string s, int fromIndex) -> int
4) - substring(int beginIndex) -> String
   - substring(int beginIndex, int endIndex) -> String
5) subsequence(int start, int end) -> CharSequence

#### String Builder specific methods
1) append(dataType dt) -> StringBuilder
2) insert(int toIndex, dataType dt) -> StringBuilder
3) delete(int start, int end) -> StringBuilder
4) deleteCharAt(int index) -> StringBuilder
5) reverse() -> StringBuilder
6) replace(int start, int end, String s) -> StringBuilder
7) capacity() -> int

#### Two more ways to create Strings
1) ```
      StringBuilder sb1 = new StringBuilder("Hello");
      String s1 = new String(sb1);
   ```
2) ```
      StringBuffer sb2 = new StringBuffer("Hello");
      String s1 = new String(sb2);
   ```