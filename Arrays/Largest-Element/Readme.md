# Largest Element in an Array

## 📌 Problem Summary

Given an integer array, find and return the largest element present in the array.

---

## 🎯 Objective

Traverse the array and determine the maximum value among all the elements.

---

## 📚 Concepts Used

- Arrays
- Traversal
- Linear Search
- Comparison Operators

---

## 💡 Approach

1. Assume the first element is the largest.
2. Traverse the array from the second element.
3. Compare each element with the current largest element.
4. If a larger element is found, update the largest value.
5. Return the largest element after completing the traversal.

---

## 📝 Algorithm

1. Initialize `largest` with the first element of the array.
2. Iterate through the remaining elements.
3. If the current element is greater than `largest`, update `largest`.
4. Return `largest`.

---

## ⏱️ Time Complexity

**O(n)**

The array is traversed exactly once.

---

## 💾 Space Complexity

**O(1)**

Only one extra variable is used to store the largest element.

---


## 📖 Explanation

The algorithm starts by considering the first element as the largest. It then scans the remaining elements one by one. Whenever a larger element is found, the value of `largest` is updated. After the complete traversal, `largest` contains the maximum element in the array.

---

## ✅ Example

### Input

```text
arr = [1, 8, 7, 56, 90]
```

### Output

```text
90
```

**Explanation:**  
The largest element in the array is **90**.

---

### Input

```text
arr = [5, 5, 5, 5]
```

### Output

```text
5
```

**Explanation:**  
All elements are equal, so the largest element is **5**.

---

### Input

```text
arr = [10]
```

### Output

```text
10
```

**Explanation:**  
Since the array contains only one element, it is the largest.

---

## 🎓 Key Learning

- Learn how to find the maximum element using a single traversal.
- Understand the concept of maintaining a running maximum.
- Practice solving array traversal problems with constant extra space.
- This approach is optimal since every element must be checked at least once.

---

**Difficulty:** 🟢 Easy  
**Language:** Java