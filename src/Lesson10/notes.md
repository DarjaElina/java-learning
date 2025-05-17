## Import
### Subpackages and import

#### If we have:
- Package p1 with class A
- Package p2 with class B and package p3 with class C inside
```
    package p1;
    import p2.*;
    
    class A {
        C c1 = new C();
    }
```
The above will be an error because this **import p2.*;** means that we are importing every class inside p2, not inside nested packages.
#### Correct way
```
    package p1;
    import p2.p3.*;
    
    class A {
        C c1 = new C();
    }
```

### Static import

#### We have:
- package p1 with class A
- package p2 with class B and **public static int a** inside
If we want to use **a** by its short name, we need to do static import:
```
    package p1;
    import static p2.B.a;
    
    class A {
        int x = a;
    }
```

#### Or without static import:
```
    package p1;
    import p2.B;
    
    class A {
        int x = B.a;
    }
```

#### This imports **all** static variables of a class
```
    import static Package.Class.*;
```

## Comments
- end-of-line:
```
    // you can write comments here
```
- multiline
```
    /* you can write comments here
    * and here
    * and here */
```
- JavaDoc:
```
    /** you can write comments here
    * and here
    * and here */
```
#### JavaDoc
- JavaDoc is a tool, part of JDK.
- It helps to describe classes.
- We can write JavaDoc comments inside class, then use JavaDoc tool and convert it to an HTML document.
