### ArrayList and List methods (addition)

- removeAll(Collection <?> c) ⇒ boolean
- retainAll(Collection <?> c) ⇒ boolean
- containsAll(Collection <?> c) ⇒ boolean
- subList(int fromIndex, int toIndex) ⇒ List< E >
- toArray() ⇒ Object[]
- toArray(T[] a) ⇒ T[]
- List.of(E... elements) ⇒ List< E >
- List.copyOf(Collection <E> c) ⇒ List< E >
> ❗️ Note: List< E > is immutable 👆 here

### Java Collections Framework (Essentials)

#### Collection Interface
- The root interface for most collection types in Java (except `Map`)
- Found in `java.util`
- Defines basic operations: add, remove, size, etc.

#### Subinterfaces of Collection
- **List** – Ordered, allows duplicates (e.g., ArrayList, LinkedList)
- **Set** – Unordered, no duplicates (e.g., HashSet, TreeSet)
- **Queue** – FIFO structure, often used in processing tasks (e.g., LinkedList, PriorityQueue)

#### Map Interface (not part of Collection)
- Stores key-value pairs
- Examples: `HashMap`, `TreeMap`, `LinkedHashMap`