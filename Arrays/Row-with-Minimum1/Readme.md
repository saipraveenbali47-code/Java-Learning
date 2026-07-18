# Row with Minimum 1s

## 📌 Problem Summary

Given a binary matrix of size **n × m**, identify the row that contains the minimum number of **1's**. If multiple rows have the same minimum count, return the **smallest (1-based) row index**.

---

## 🎯 Objective

Find and return the index of the row containing the fewest number of `1`s.

---

## 📚 Concepts Used

- 2-D Arrays
- Matrix Traversal
- Nested Loops
- Counting
- Conditional Statements

---

## 💡 Approach

1. Initialize variables to keep track of the minimum number of `1`s and the corresponding row index.
2. Traverse each row of the matrix.
3. Count the number of `1`s present in the current row.
4. Compare the count with the current minimum.
5. If a smaller count is found, update the minimum count and store the current row index.
6. If multiple rows have the same minimum count, retain the first occurrence.
7. Return the row index using **1-based indexing**.

---

## 📝 Algorithm

1. Initialize `minCount` with a very large value.
2. Initialize `answer` to `1`.
3. Iterate through each row.
4. Count the number of `1`s in that row.
5. If the count is less than `minCount`, update both `minCount` and `answer`.
6. After traversing all rows, return `answer`.

---

## ⏱️ Time Complexity

**O(n × m)**

Each element of the matrix is visited exactly once.

---

## 💾 Space Complexity

**O(1)**

Only a few extra variables are used for counting and tracking the result.

---

## 📖 Explanation

The solution examines each row individually and counts the number of `1`s present. While traversing, it keeps track of the row with the smallest count of `1`s. If another row has the same count, it is ignored because the first occurrence (smallest index) should be returned.

---

## ✅ Example

### Input

```text
mat = [
 [1, 1, 1, 1],
 [1, 1, 0, 0],
 [0, 0, 1, 1],
 [1, 1, 1, 1]
]
```

### Output

```text
2
```

**Explanation:**

- Row 1 → 4 ones
- Row 2 → 2 ones
- Row 3 → 2 ones
- Row 4 → 4 ones

Rows **2** and **3** have the minimum number of `1`s. Since row **2** has the smaller index, the answer is **2**.

---

### Input

```text
mat = [
 [0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]
]
```

### Output

```text
1
```

**Explanation:**

Every row contains **0** ones. Since all rows have the same count, the smallest row index (**1**) is returned.

---

## 🎓 Key Learning

- Learn how to count specific elements while traversing a matrix.
- Understand how to maintain the minimum value during iteration.
- Practice handling tie-breaking conditions.
- Strengthen matrix traversal and conditional logic skills.

---

**Difficulty:** 🟢 Easy  
**Language:** ☕ Java