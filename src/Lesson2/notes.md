# Lesson 2: Primitive Data Types in Java

## Java Variables
- A variable consists of: **Type, Name, Size, Value**

## Primitive Data Types (8 total)
- **Integer types**: `byte`, `short`, `int`, `long`
- **Floating-point types**: `float`, `double`
- **Character type**: `char`
- **Boolean type**: `boolean`

---

## Integers

| Type  | Size    | Range                     |
|-------|---------|---------------------------|
| byte  | 8-bit   | -128 to 127               |
| short | 16-bit  | -32,768 to 32,767         |
| int   | 32-bit  | -2³¹ to 2³¹ - 1           |
| long  | 64-bit  | -2⁶³ to 2⁶³ - 1           |

- `long` requires **L** suffix if value exceeds `int` range: `long l = 10000000000L;`

---

## Floating-Point

| Type   | Size     | Notes                            |
|--------|----------|----------------------------------|
| float  | 32-bit   | Requires `F` suffix              |
| double | 64-bit   | Default type for decimals        |

---

## Character (`char`)
- 16-bit Unicode
- 3 ways to assign:
  - `'A'` (single character)
  - `char x = 300;` → symbol at Unicode decimal 300 (Ĭ)
  - Unicode escape: `'\u1234'` (ሴ)

- Characters like `'\u0300'` are *combining marks*: invisible unless combined (e.g., `"a\u0300"` prints **à**)

---

## Boolean
- `true` or `false`

---

## Number Systems in Java

| Base        | Prefix     | Example    | Value |
|-------------|------------|------------|--------|
| Decimal     | none       | `60`       | 60     |
| Binary      | `0b`       | `0b111100` | 60     |
| Octal       | `0`        | `074`      | 60     |
| Hexadecimal | `0x`       | `0x3C`     | 60     |

---

## Underscores for Readability (Java 7+)

- ✅ `int n = 1_000_000;`
- ❌ Not allowed at:
    - start/end of number
    - around `.` in floats
    - around base prefixes (`0x`, `0b`)
    - around suffixes (`L`, `F`, etc.)

---

## Fun Unicode Fact
- Some characters (like `\u0300`) are invisible alone but combine with others!
- `"a\u0300"` → prints `à`
