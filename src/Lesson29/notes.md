## Java Date & Time Classes
#### LocalDate
Contains information about the day: year, month, day

#### LocalTime
Contains information about time: hours, minutes, seconds, nanosecond

#### LocalDateTime
Contains information about date and time: year, month, day, hour, minutes, seconds, nanoseconds

> These three classes live in java.time package
> They all have static now() method that returns corresponding objects with current values

### Creating instances of LocalDate, LocalTime and LocalDateTime
We cannot create instances of LD, LT and LDT using constructors, because they have private access modifier.

But we can do it, using methods **of()**

### DateTime of() 

```java
public static LocalDate of(int year, int month, int dayOfMonth);
// or
public static LocalDate of(int year, Month month, int dayOfMonth);
```
### LocalTime of()

```java
public static LocalTime of(int hour, int minute);
// or
public static LocalTime of(int hour, int minute, int second);
// or
public static LocalTime of(int hour, int minute, int second, int nanosecond);
```

### LocalDateTime of()
```java
public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute);
// or
public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second);
// or
public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanosecond);
// or
public static LocalDateTime of(LocalDate day, LocalTime time);
```