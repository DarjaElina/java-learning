## Compiling and running Java code from the command line

### Without package declaration:
```bash
    javac ClassName.java
    java ClassName
```

### With package declaration:
```bash
    javac ClassName.java
    cd ..
    java PackageName.ClassName
```

### Put compiled .class file into another package
1) First option 
```bash
    javac -d . ClassName.java
    java PackageName.ClassName
```
2) Second option
```bash
    javac -d . ClassName.java
    java -classpath . PackageName.ClassName
```

- **-d** for creating new directory and putting compiled code there
- **.** means current directory

So it means: compiler ClassName.java, and inside the current directory create another directory and put compiled .class there

#### Classpath
Tools
Classpath is a parameter in the Java Virtual Machine or the Java compiler that specifies the location of user-defined classes and packages. The parameter may be set either on the command-line, or through an environment variable.

If Java Class does not contain references to other packages and classes, with Java 11 we can compile and run it with one command:
```bash
  java ClassName.java
```

### jar files
Java Archives

jar files are like zip files with some extension. It stores files with Java classes.

### Creating .jar from the command line
```bash
    javac -d . ClassName.java
    jar -cvf jarName.jar PackageName
```

### What does -cvf mean?
- **c** means **create**
- **v** means **verbose**: show detailed info in the command line about created .jar
- **f** means **file**

So we are saying: create .jar, call it jarName and put there everything from the package PackageName