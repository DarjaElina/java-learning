### ArrayList

The ArrayList class is a resizable array.

#### Creating an ArrayList
1) ```java
    ArrayList<DataType> myList = new ArrayList<DataType>();

2) ```java
    ArrayList<DataType> myList2 = new ArrayList<>();

3) ```java
    ArrayList<DataType> myList3 = new ArrayList<>(55);

4) ```java
    ArrayList<DataType> myList4 = new ArrayList<>(myList3);
    ````
#### Wrapper Classes
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
We need Wrapper Classes when using ArrayList, because ArrayList cannot contain primitive data types.
- byte => Byte
- short	=> Short
- int => Integer
- long => Long
- float	=> Float
- double => Double
- boolean => Boolean
- char => Character
   
#### ArrayList Methods
1) add()
   - add(DataType element) => boolean
   - add(int index, DataType element) => boolean'
2) get(int index) => DataType
3) set(int index, DataType element) => DataType
4) remove()
   - remove(Object element) => boolean
   - remove(int index) => DataType
5) addAll()
   - addAll(ArrayList aL) => boolean
   - addAll(int index, ArrayList aL) => boolean
6) clear() => void
7) indexOf(Object element) => int
8) size() => int
9) isEmpty() => boolean
10) contains(Object element) => boolean
11) toString() => String

#### Methods related to ArrayList
1) clone() => Object
2) toArray()
   - toArray() => Object[]
   - toArray(DataType[] array) => DataType[]
3) Arrays.asList(DataType[]) => List<DataType>
4) Collections.sort(ArrayList<DataType>) => void
5) equals(ArrayList<DataType>) => boolean


#### Iterator & ListIterator
```
   Iterator<DataType> iterator = aL.iterator();
   while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
```



