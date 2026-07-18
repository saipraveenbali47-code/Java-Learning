# Longest Subarray with Given Sum K (Positive Numbers)

## 📌 Problem Summary

Given an array of **positive integers** and an integer **K**, determine the length of the longest contiguous subarray whose sum is exactly **K**. If no such subarray exists, return **0**.

---

## 🎯 Objective

Find the maximum length of a contiguous subarray whose sum equals the given target value **K**.

---

## 📚 Concepts Used

- Arrays
- Sliding Window (Two Pointers)
- Window Expansion and Shrinking
- Array Traversal

---

## 💡 Approach

Since the array contains **only positive integers**, the Sliding Window technique can be used efficiently.

1. Initialize two pointers (`left` and `right`) to represent the current window.
2. Expand the window by moving the `right` pointer and adding elements to the current sum.
3. If the current sum becomes greater than **K**, shrink the window from the left until the sum is less than or equal to **K**.
4. Whenever the current sum equals **K**, update the maximum window length.
5. Continue until the entire array has been traversed.

---

## 📝 Algorithm

1. Initialize `left = 0`, `sum = 0`, and `maxLength = 0`.
2. Traverse the array using the `right` pointer.
3. Add the current element to `sum`.
4. While `sum > K`, remove elements from the left side of the window and increment `left`.
5. If `sum == K`, update `maxLength`.
6. Return `maxLength`.

---

## ⏱️ Time Complexity

**O(n)**

Each element enters and leaves the sliding window at most once.

---

## 💾 Space Complexity

**O(1)**

Only a few extra variables are used.

---

## 📖 Explanation

Because all elements are positive, the window sum always increases when expanding the window and decreases when shrinking it. This property allows us to efficiently find the longest valid subarray without checking every possible subarray.

---

## ✅ Example

### Input

```text
nums = [2, 3, 5, 1, 9]
K = 10
```

### Output

```text
3
```

**Explanation:**

The longest subarray with sum **10** is:

```text
[2, 3, 5]
```

Length = **3**

---

### Input

```text
nums = [1, 2, 1, 1, 1]
K = 3
```

### Output

```text
3
```

**Explanation:**

The longest subarray with sum **3** is:

```text
[1, 1, 1]
```

Length = **3**

---

## 🎓 Key Learning

- Learn when the **Sliding Window** technique is applicable.
- Understand why the approach works only for arrays containing **positive numbers**.
- Practice maintaining a dynamic window using two pointers.
- Improve optimization skills by reducing the brute-force complexity from **O(n²)** to **O(n)**.

---

> **Note:** This Sliding Window approach works only when all array elements are **positive**. If the array contains **negative numbers or zeros**, a different approach (using Prefix Sum and HashMap) is required.

---

**Difficulty:** 🟢 Easy  
**Language:** ☕ Java