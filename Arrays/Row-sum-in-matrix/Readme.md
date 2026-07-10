# Sum of Elements in Each Row of a Matrix

## 📌 Problem Summary

Given a 2-dimensional integer matrix, calculate the sum of elements in each row and return the sums as a list.

---

## 🎯 Objective

Compute the sum of every row in the matrix and store each row's sum in a result list.

---

## 📚 Concepts Used

- 2-D Arrays
- Nested Loops
- Array Traversal
- ArrayList

---

## 💡 Approach

1. Create an empty list to store the row sums.
2. Traverse each row of the matrix.
3. Initialize a variable `sum` to `0` for every row.
4. Traverse all columns of the current row and add each element to `sum`.
5. Add the computed `sum` to the result list.
6. Return the list containing the sum of every row.

---

## 📝 Algorithm

1. Initialize an empty `ArrayList<Integer>`.
2. Iterate through each row of the matrix.
3. Set `sum = 0`.
4. Iterate through every element of the current row.
5. Add each element to `sum`.
6. Store `sum` in the result list.
7. Return the result list.

---

## ⏱️ Time Complexity

**O(n × m)**

Each element of the matrix is visited exactly once.

---

## 💾 Space Complexity

**O(n)**

An extra list is used to store the sum of each row.

---



## 📖 Explanation

The algorithm processes the matrix one row at a time. For each row, it calculates the total by adding all its elements. The computed sum is then stored in an `ArrayList`. After processing every row, the list containing all row sums is returned.

---

## ✅ Example

### Input

```text
mat = [
 [1, 2, 3],
 [4, 5, 6],
 [7, 8, 9]
]
```

### Output

```text
[6, 15, 24]
```

**Explanation:**

- Row 1 → 1 + 2 + 3 = 6
- Row 2 → 4 + 5 + 6 = 15
- Row 3 → 7 + 8 + 9 = 24

---

### Input

```text
mat = [
 [1, 2],
 [10, 2],
 [3, 3]
]
```

### Output

```text
[3, 12, 6]
```

**Explanation:**

- Row 1 → 1 + 2 = 3
- Row 2 → 10 + 2 = 12
- Row 3 → 3 + 3 = 6

---

## 🎓 Key Learning

- Understand how to traverse a 2-D array using nested loops.
- Learn to process one row at a time.
- Practice using `ArrayList` to store computed results.
- Strengthen understanding of matrix traversal and aggregation problems.

---

**Difficulty:** 🟢 Easy  
**Language:** Java