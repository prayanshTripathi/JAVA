# Bitwise Operators Truth Tables in Java

## Overview
Bitwise operators in Java operate on individual bits. This document contains truth tables for all two-input bitwise operators.

---

## 1. AND Operator (&)

Returns 1 if both bits are 1, otherwise returns 0.

| A | B | A & B |
|---|---|-------|
| 0 | 0 |   0   |
| 0 | 1 |   0   |
| 1 | 0 |   0   |
| 1 | 1 |   1   |

**Example in Java:**
```java
int result = 5 & 3;  // 0101 & 0011 = 0001 (result = 1)
```

---

## 2. OR Operator (|)

Returns 1 if at least one bit is 1, otherwise returns 0.

| A | B | A \| B |
|---|---|--------|
| 0 | 0 |   0    |
| 0 | 1 |   1    |
| 1 | 0 |   1    |
| 1 | 1 |   1    |

**Example in Java:**
```java
int result = 5 | 3;  // 0101 | 0011 = 0111 (result = 7)
```

---

## 3. XOR Operator (^)

Returns 1 if the bits are different, returns 0 if the bits are the same.

| A | B | A ^ B |
|---|---|-------|
| 0 | 0 |   0   |
| 0 | 1 |   1   |
| 1 | 0 |   1   |
| 1 | 1 |   0   |

**Example in Java:**
```java
int result = 5 ^ 3;  // 0101 ^ 0011 = 0110 (result = 6)
```

---

## 4. NOT Operator (~)

Inverts all bits (unary operator - single input).

| A | ~A |
|---|-----|
| 0 |  1  |
| 1 |  0  |

**Example in Java:**
```java
int result = ~5;  // ~0101 = 1010 (in two's complement, result = -6)
```

---

## 5. Left Shift Operator (<<)

Shifts bits to the left, filling with zeros from the right.

| A | B | A << B | Explanation |
|---|---|--------|-------------|
| 5 | 1 |   10   | 0101 << 1 = 1010 |
| 5 | 2 |   20   | 0101 << 2 = 10100 |
| 3 | 2 |   12   | 0011 << 2 = 1100 |

**Example in Java:**
```java
int result = 5 << 1;  // 0101 << 1 = 1010 (result = 10)
```

---

## 6. Right Shift Operator (>>)

Shifts bits to the right, filling with the sign bit (arithmetic right shift).

| A | B | A >> B | Explanation |
|---|---|--------|-------------|
| 20 | 1 |   10   | 10100 >> 1 = 01010 |
| 20 | 2 |   5    | 10100 >> 2 = 00101 |
| -20 | 1 |  -10   | Preserves sign bit |

**Example in Java:**
```java
int result = 20 >> 1;  // 10100 >> 1 = 01010 (result = 10)
```

---

## 7. Unsigned Right Shift Operator (>>>)

Shifts bits to the right, always filling with zeros (logical right shift).

| A | B | A >>> B | Explanation |
|---|---|---------|-------------|
| 20 | 1 |   10    | 10100 >>> 1 = 01010 |
| -20 | 1 | Large positive | Fills with zeros (differs from >>) |

**Example in Java:**
```java
int result = 20 >>> 1;  // 10100 >>> 1 = 01010 (result = 10)
int result2 = -20 >>> 1;  // Fills with zeros on left
```

---

## Combined Truth Table Summary

| A | B | A & B | A \| B | A ^ B |
|---|---|-------|--------|-------|
| 0 | 0 |   0   |   0    |   0   |
| 0 | 1 |   0   |   1    |   1   |
| 1 | 0 |   0   |   1    |   1   |
| 1 | 1 |   1   |   1    |   0   |

---

## Common Use Cases

- **AND (&)**: Check if a specific bit is set
- **OR (|)**: Set a specific bit to 1
- **XOR (^)**: Toggle a specific bit or swap values without temp variable
- **NOT (~)**: Invert all bits
- **Left Shift (<<)**: Multiply by powers of 2
- **Right Shift (>>)**: Divide by powers of 2 (preserves sign)
- **Unsigned Right Shift (>>>)**: Divide by powers of 2 (logical shift)
