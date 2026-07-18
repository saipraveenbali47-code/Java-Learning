# Kadane's Algorithm – Maximum Subarray Sum

## 📌 Problem Summary

Given an integer array containing both **positive and negative numbers**, find the **maximum possible sum** of any contiguous subarray.

A subarray is a contiguous sequence of elements within the array.

---

## 🎯 Objective

Determine the maximum sum that can be obtained from any contiguous subarray using an efficient algorithm.

---

## 📚 Concepts Used

- Arrays
- Kadane's Algorithm
- Dynamic Programming
- Running Sum
- Maximum Value Tracking

---

## 💡 Approach

Kadane's Algorithm efficiently computes the maximum subarray sum in a single traversal.

1. Initialize two variables:
   - `currentSum` to store the sum of the current subarray.
   - `maxSum` to store the maximum subarray sum found so far.
2. Traverse the array element by element.
3. Add the current element to `currentSum`.
4. Update `maxSum` if `currentSum` becomes larger.
5. If `currentSum` becomes negative, reset it to `0` since a negative sum cannot contribute to a larger future subarray.
6. Continue until the entire array has been processed.
7. Return `maxSum`.

> **Note:** If the array contains **all negative numbers**, initialize `maxSum` with the first element to ensure the largest negative value is returned.

---

## 📝 Algorithm

1. Initialize `currentSum = 0`.
2. Initialize `maxSum` with the first element of the array.
3. Traverse each element:
   - Add the current element to `currentSum`.
   - Update `maxSum` if `currentSum` is greater.
   - If `currentSum < 0`, set `currentSum = 0`.
4. Return `maxSum`.

---

## ⏱️ Time Complexity

**O(n)**

The array is traversed only once.

---

## 💾 Space Complexity

**O(1)**

Only two variables are used regardless of the input size.

---

## 📖 Explanation

Kadane's Algorithm maintains a running sum while traversing the array. If the running sum becomes negative, it is discarded because adding a negative sum to future elements would only decrease the overall total. Throughout the traversal, the algorithm continuously updates the maximum subarray sum encountered.

For arrays containing **all negative numbers**, the algorithm should initialize `maxSum` with the first element so that the largest (least negative) element is returned.

---

## ✅ Example

### Input

```text
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

### Output

```text
6
```

**Explanation:**

The maximum sum subarray is:

```text
[4, -1, 2, 1]
```

Sum = **6**

---

### Input

```text
nums = [-3, -2, -5, -1]
```

### Output

```text
-1
```

**Explanation:**

Since all elements are negative, the maximum subarray consists of the single element **-1**, which is the largest value in the array.

---

## 🎓 Key Learning

- Learn how Kadane's Algorithm optimizes the brute-force approach.
- Understand why resetting the running sum improves efficiency.
- Practice solving maximum subarray problems in linear time.
- Recognize how to handle edge cases such as arrays containing all negative numbers.

---

**Difficulty:** 🟢 Easy  
**Language:** ☕ Java