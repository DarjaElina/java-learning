### Array Methods

#### compare()

##### Arrays.compare(int[], int[])
- Returns only -1, 0, or 1
- Internally uses Integer.compare(a[i], b[i])

##### Arrays.compare(char[], char[])
- Returns the actual Unicode (ASCII-compatible) difference, like a[i] - b[i]
- Internally: compares characters as unsigned values

#### mismatch()

**mismatch()** is used to compare two arrays element by element and determines the index of the first mismatch.
- If arrays are the same, it returns **-1**
- If they are different, it returns the first array index where values are unequal