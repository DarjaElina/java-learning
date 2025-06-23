## Introduction to java.io
Package java.io provides for system input and output through data streams, serialization, and the file system.

> Serialization is the process of changing data into a form that can be stored or sent and put back into its original form later

### java.io classes
- **File** class <br>
> Java File class is a representation of a file or directory pathname.
- **FileInputStream** <br>
> FileInputStream class in Java is useful for reading data from a file in the form of a Java sequence of bytes.
- **FileOutputStream** <br>
> It is used to write data to a file as a stream of bytes.

#### java.io Exceptions

- 💥 Constructors of FileInputStream and FileOutputStream can throw **FileNotFoundException**.
- 💥 Method **read** and **write** of FileInputStream and FileOutputStream can throw **IOException**.
> **IOException** is a superclass of **FileNotFoundException**
