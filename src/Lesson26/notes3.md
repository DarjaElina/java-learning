### Non-static and static initializers

In order to perform any operations while assigning values to an instance data member, an initializer block is used.

In simpler terms, the initializer block is used to declare/initialize the common part of various constructors of a class.

It runs every time whenever the object is created.

#### Order of initializing init. blocks and variables
1) Static blocks and superclass variables
2) Static blocks and subclass variables
3) Non-static blocks and superclass variables
4) Superclass constructor
5) Non-static blocks and subclass variables
6) Subclass constructor

> items 3–6 happen only when objects are created

## Non-access modifiers
### ✅ transient
**What it does:**<br>
Marks a variable to be ignored during serialization (when saving an object to a file or sending it over the network).

**Used in:**<br>
Classes that implement Serializable.
### ✅ native
**What it does:**<br>
Marks a method that is implemented in another language, like C or C++ — not in Java itself.

**Used in:**<br>
Calling OS-level or platform-specific code (rare in everyday coding).

### ✅ synchronized
**What it does:**<br>
Prevents multiple threads from running a method (or block of code) at the same time.

**Used in:**<br>
Multithreaded programs, when you want to avoid data races or inconsistent states. 

### ✅ volatile
**What it does:**<br>
Tells threads to not cache a variable and always read the most up-to-date value from memory.

**Used in:**<br>
Multithreading, when multiple threads read/write the same variable.

### ✅ strictfp
**What it does:**<br>
Forces floating-point math to behave the same on every platform, even if hardware handles numbers differently.

**Used in:**<br>
When you need consistent math results across different devices.