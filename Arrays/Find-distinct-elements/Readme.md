# Count Distinct Elements in an Array

## 📌 Problem Summary

Given an integer array, determine the total number of distinct (unique) elements present in the array.

---

## 🎯 Objective

Return the count of all unique elements in the given array.

---

## 📚 Concepts Used

- Arrays
- HashSet
- Collection Framework
- Enhanced for loop

---

## 💡 Approach

1. Create an empty `HashSet`.
2. Traverse the array.
3. Insert each element into the `HashSet`.
4. Since a `HashSet` stores only unique elements, duplicate values are ignored.
5. Return the size of the `HashSet`, which represents the number of distinct elements.

---

## 📝 Algorithm

1. Initialize an empty `HashSet<Integer>`.
2. Iterate through each element of the array.
3. Add every element to the set.
4. Return `set.size()`.

---

## ⏱️ Time Complexity

**O(n)**

Each element is processed once, and insertion into a `HashSet` takes **O(1)** on average.

---

## 💾 Space Complexity

**O(n)**

In the worst case, all elements are unique and are stored in the `HashSet`.


---

## 📖 Explanation

A `HashSet` is used because it automatically removes duplicate values. As each array element is added, only unique elements are stored. Finally, the size of the set gives the total number of distinct elements in the array.

---

## ✅ Example

### Input

```text
arr = [2, 2, 3, 2]
```

### Output

```text
2
```

**Explanation:**

The distinct elements are **2** and **3**.

---

### Input

```text
arr = [12, 1, 14, 3, 16]
```

### Output

```text
5
```

**Explanation:**

All elements are unique, so the count is **5**.

---

## 🎓 Key Learning

- Learn how to use `HashSet` to eliminate duplicate values.
- Understand the importance of the Java Collections Framework.
- Practice solving uniqueness-related problems efficiently.
- Using a `HashSet` simplifies the solution compared to manually checking for duplicates.

---

**Difficulty:** 🟢 Easy  
**Language:** Java