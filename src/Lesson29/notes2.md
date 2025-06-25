### Changing instances of LocalDate, LocalTime, LocalDateTime
> ❗️ Objects of LD, LT and LDT are immutable

### LocalDate methods
- plusDays(long amountOfDays) => LocalDate
- minusDays(long amountOfDays) => LocalDate
- plusWeeks(long amountOfWeeks) => LocalDate
- minusWeeks(long amountOfWeeks) => LocalDate
- plusMonths(long amountOfMonths) => LocalDate
- minusMonths(long amountOfMonths) => LocalDate
- plusYears(long amountOfYears) => LocalDate
- minusYears(long amountOfYears) => LocalDate

### LocalTime methods
- plusHours(long amountOfHours) => LocalDate
- minusHours(long amountOfHours) => LocalDate
- plusMinutes(long amountOfMinutes) => LocalDate
- minusMinutes(long amountOfMinutes) => LocalDate
- plusSeconds(long amountOfSeconds) => LocalDate
- minusSeconds(long amountOfSeconds) => LocalDate
- plusNanos(long amountOfNanos) => LocalDate
- minusNanos(long amountOfNanos) => LocalDate

### LocalDateTime methods
LocalDateTime methods cover methods of LocalDate and LocalTime and return LocalDateTime

### isAfter, isBefore
Used to compare LD, LT and LDT objects. Return boolean. Compiler allows comparing only objects of corresponding classes, e.g., LT.isAfter(LT)

### Class Period
The Period Class in Java class obtains a quantity or amount of time in terms of years, months and days.
```java
public static Period ofDays(int amountOfDays);

public static Period ofWeeks(int amountOfWeeks);

public static Period ofMonths(int amountOfMonths);

public static Period ofYears(int amountOfYears);

public static Period of(int amountOfYears, int amountOfMonths, int amountOfDays);
```

We can use methods **plus** and **minus** to add and subtract periods to/from LocalDate and LocalDateTime object, but **NOT** LocalTime