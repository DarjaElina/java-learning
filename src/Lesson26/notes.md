## Methods equals and toString
If we override **equals()**, we must use Object as a parameter type.

### equals()

#### Correctly overridden **equals()** must be:

##### ✅ Symmetric
For non-null reference variables **a & b**, **a.equals(b) is true** only if **b.equals(a) is true**

##### ✅ Reflexive
For non-null reference variable **a**, **a.equals(a) is always true**

##### ✅ Transitive 🧐
For non-null reference variables **a, b and c**, if **a.equals(b) is true** and **b.equals(c) is true**, **a.equals(c)** must also be **true**

##### ✅ Consistent
For non-null reference variables **a & b**, multiple calls of **a.equals(b)** must return **only true** or **only false**

##### 🚫 Not equal to null
For non-null reference variable **a**, **a.equals(null)** is always **false**

### toString()

toString() belongs to Object class

Default toString() returns class name, @ and number (hashcode)