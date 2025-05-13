## Packages

### Why we need packages
- Access protection 
> Let's say we have 2 packages, with class A and class B in one package, and class C in another package.
> We can make all elements (methods, variables, etc. ) of class A accessible to class C, and elements of class B **not** accessible to it.

- Namespace management
- Keeping related classes in one place

## Access Modifier
- public
> Let's say we have package Package1 with classes A, B and C.
> And package Package2 with classes D and E,
> Inside class A we have variable: **public double salary**.
> This variable will be accessible to **all** other classes, B, C, D and E.

- private
> Now we have **private double salary** inside class A.
> It will be visible **only** for class A.
> Neither classes B and C (same package), nor D and E (diff. package) will have access to it.

- (default)
> When we do not specify access modifier, it becomes **default**
> We have **double salary** inside class A.
> It will be available to all classes inside the same package (in our case C and B)

- protected
> **protected** means the variable or method is available to other classes in the same package, and to subclasses, even if those subclasses are in a different package.