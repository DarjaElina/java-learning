## Getting information from LocalDate

- getDayOfWeek() => DayOfWeek
- getDayOfMonth() => int
- getDayOfYear() => int
- getMonth() => Month
- getMonthValue() => int
- getYear() => int

## From LocalTime
- getNano() => int
- getSecond() => int
- getMinute() =>
- getHour() =>

## From LocalDateTime
Includes all methods from LocalDate and LocalTime

## DateTimeFormatter
- Lives in java.time.format;
- We can use format() method of DateTimeFormatter to format the date

### parse() method
Used to parse String objects to LocalDate, LocalTime and LocalDateTime