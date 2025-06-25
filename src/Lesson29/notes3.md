## Class Duration

Similar to Period, but allows creating objects with smaller time units (hours, minutes, seconds, milliseconds, nanoseconds)

```java
public static Duration ofDays(long amountOfDays);

public static Duration ofHours(long amountOfHours);

public static Duration ofMinutes(long amountOfMinutes);

public static Duration ofSeconds(long amountOfSeconds);

public static Duration ofMillis(long amountOfMillis);

public static Duration ofNanos(long amountOfNanos);
```

NB:
- Duration works with LocalTime, LocalDateTime
- Period works with LocalDate, LocalDateTime