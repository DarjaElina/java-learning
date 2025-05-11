### Structure of Java class

1) The package statement
2) The import statement
3) Class declarations and definitions
   - Variables (State)
   - Methods (behaviour)
   - Constructors
4) Comments

#### Rules about class and files naming

- File name should be the same as **public** class name.
- We can create as many classes inside one file as needed, but only **one public class**.
- We can create files without public class. In this case file name should be same as one of the not public classes.

> We cannot execute Java class without main method ❗️

#### Difference between primitive and reference data types

```
   int a = 10;
```
Here the value of a will be 10;


```
   BankAccount account = new BankAccount();
```
The value of account will be a **reference** (or pointer) to **where the actual BankAccount object is stored in memory**.
An address of the slot in memory where our object is stored.

#### Default values of data types in Java

- Primitive:
  - byte, short, int, long: 0
  - float, double: 0.0
  - char: '\u0000' or 0
  - boolean: false

- Reference:
   - Default value of all reference data types is **null**

#### Instance variables

```
   public class BankAccount {
      // these are instance variables
      int id;
      String name;
      double balance;
   }
```

Each class in Java has a built-in constructor. When we create an instance of our BankAccount, using BankAccount myAccount = new BankAccount(), constructor is called.
We create a new object of type BankAccount in memory. This object has 3 variables: id, name and balance. They will have default values.
Then we assign the address of this fresh created object to the variable myAccount.

#### Class String

##### 2 ways of creating Strings in Java
1) ```
    String name = "Daria";
   ```
2) ```
    String name = new String("Daria");
   ```

