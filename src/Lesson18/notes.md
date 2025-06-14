### Java Arrays

- When we create an Array in Java, it has a fixed length
- Array is an object
- All elements should be of the same data type (either reference or primitive)

#### Creating an array in Java
##### Of primitives
```
    int[] arr = {1, 5, 0, -2, 5};
```
##### Of reference data type (this array will store addresses of objects in memory)
```
    String[] arr2 = {"Hello", "Bye", "Ok"};
```

#### Multidimensional Arrays
```
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
```

#### Creating arrays step-wise
1) Declaration (these arrays reference to null)
``` 
    int[] array1;
    String[] array2;
    double[] array3;
```
2) Allocation (we create a new object in memory; each element of the array will have a default value of the data type)
```
    array1 = new String[3]; // will create {null, null, null}, because default value of String is null
    array2 = new int[4][2]; // will create {{0, 0}, {0, 0}, {0, 0}, {0, 0}}
    array3 = new int[3][]; // will create {{}, {}}, but length on inner arrays is not defined yet
```
3) Initialization
- Static
- Dynamic

#### Mixed ways of creating arrays
1) Declaration + Allocation
```
    int[] arr = new int[7];
```
2) Declaration + Allocation + Initialization
```
    int[] arr2 = { 1, 2, 3 };
```
3) 🤔
```
    // ✅
    int[] arr3;
    arr3 = new int[]{1, 2, 3};
    // ❌
    int[] array1;
    array1 = {1, 2, 3};
```
4) 🤔🤔
```
    // ✅
    int[] arr4 = new int[]{1, 2, 3};
    // ❌
    int[] array4 = new int[3]{1, 2, 3};
```

### Introduction to Exceptions
1) ArrayIndexOutOfBoundsException
2) NullPointerException

### Arrays Methods

> Live in **java.util.Arrays**;

1) sort(array)
2) binarySearch(array, value)

### Extra materials to String & String Builder Classes
#### Another String constructor:
```
    char[] arr = new char[]{'H', 'e', 'l', 'l', 'o'};
    String s = new String(arr);
```

#### append() with an array as parameter
```
    StringBuilder sb1 = new StringBuilder("Ok");
    char[] arr = {'H', 'e', 'l', 'l', 'o'};
    sb1.append(arr, 2, 3);
```

#### insert()
```
    StringBuilder sb1 = new StringBuilder("Ok");
    char[] arr = {'H', 'e', 'l', 'l', 'o'};
    sb1.insert(1, arr, 2, 3);
```