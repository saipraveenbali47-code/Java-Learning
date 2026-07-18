# Matrix Snake Pattern

## 📌 Problem Summary

Given a square matrix of size **n × n**, traverse and print its elements in a **snake pattern**. The traversal alternates direction for each row:
- Traverse left to right for even-indexed rows.
- Traverse right to left for odd-indexed rows.

---

## 🎯 Objective

Return the elements of the matrix in a snake-like traversal order.

---

## 📚 Concepts Used

- 2-D Arrays
- Matrix Traversal
- Nested Loops
- Conditional Statements
- ArrayList

---

## 💡 Approach

1. Traverse the matrix row by row.
2. If the current row index is even, iterate through the columns from left to right.
3. If the current row index is odd, iterate through the columns from right to left.
4. Add each visited element to the result list.
5. Return the final list containing the snake pattern traversal.

---

## 📝 Algorithm

1. Create an empty list to store the traversal.
2. Iterate through each row of the matrix.
3. Check whether the row index is even or odd.
4. Traverse the row in the appropriate direction.
5. Store every visited element in the result list.
6. Return the completed list.

---

## ⏱️ Time Complexity

**O(n²)**

Every element of the matrix is visited exactly once.

---

## 💾 Space Complexity

**O(n²)**

The output list stores all elements of the matrix.

---

## 📖 Explanation

The snake pattern alternates the direction of traversal for every row. Even-indexed rows are traversed from left to right, while odd-indexed rows are traversed from right to left. This creates a continuous zigzag (snake-like) traversal of the matrix.

---

## ✅ Example

### Input

```text
mat = [
 [45, 48, 54],
 [21, 89, 87],
 [70, 78, 15]
]
```

### Output

```text
[45, 48, 54, 87, 89, 21, 70, 78, 15]
```

**Explanation:**

- Row 0 → Left to Right → 45, 48, 54
- Row 1 → Right to Left → 87, 89, 21
- Row 2 → Left to Right → 70, 78, 15

---

### Input

```text
mat = [
 [1, 2],
 [3, 4]
]
```

### Output

```text
[1, 2, 4, 3]
```

**Explanation:**

- Row 0 → Left to Right → 1, 2
- Row 1 → Right to Left → 4, 3

---

## 🎓 Key Learning

- Learn how to traverse a matrix in different directions.
- Understand how row parity (even/odd index) affects traversal.
- Practice using nested loops with conditional logic.
- Build a foundation for advanced matrix traversal patterns such as spiral, diagonal, and wave traversal.

---

**Difficulty:** 🟢 Easy  
**Language:** ☕ Java