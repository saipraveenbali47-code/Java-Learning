# Leaders in an Array

## 📌 Problem Summary

Given an integer array, identify all the **leader elements**.

A **leader** is an element that is **greater than or equal to every element to its right**. The rightmost element is always considered a leader.

---

## 🎯 Objective

Find and return all leader elements in the array while preserving their original order.

---

## 📚 Concepts Used

- Arrays
- Reverse Traversal
- Maximum Element Tracking
- ArrayList

---

## 💡 Approach

An efficient solution is to traverse the array from **right to left**.

1. Start from the last element, which is always a leader.
2. Maintain a variable `maxRight` to store the maximum element encountered so far.
3. Traverse the array in reverse.
4. If the current element is greater than or equal to `maxRight`, it is a leader.
5. Update `maxRight` and store the leader.
6. Since the traversal is from right to left, reverse the collected leaders before returning them.

---

## 📝 Algorithm

1. Initialize an empty list to store leaders.
2. Set `maxRight` as the last element of the array.
3. Add the last element to the list.
4. Traverse the array from the second-last element to the first.
5. If the current element is greater than or equal to `maxRight`:
   - Add it to the list.
   - Update `maxRight`.
6. Reverse the list to restore the original order.
7. Return the list of leaders.

---

## ⏱️ Time Complexity

**O(n)**

The array is traversed once, followed by reversing the result list.

---

## 💾 Space Complexity

**O(n)**

Additional space is required to store the leader elements.

---

## 📖 Explanation

Instead of checking every element against all elements to its right (which would take **O(n²)** time), the optimized approach scans the array from right to left while maintaining the largest element seen so far. Whenever an element is greater than or equal to this maximum, it is identified as a leader.

---

## ✅ Example

### Input

```text
arr = [4, 7, 1, 0]
```

### Output

```text
[7, 1, 0]
```

**Explanation:**

- `0` is the rightmost element, so it is a leader.
- `1` is greater than `0`.
- `7` is greater than `1` and `0`.
- `4` is not greater than `7`, so it is not a leader.

---

### Input

```text
arr = [10, 22, 12, 3, 0, 6]
```

### Output

```text
[22, 12, 6]
```

**Explanation:**

- `6` is the rightmost element, so it is a leader.
- `12` is greater than `3`, `0`, and `6`.
- `22` is greater than every element to its right.
- The remaining elements are not leaders.

---

## 🎓 Key Learning

- Learn how reverse traversal can simplify array problems.
- Understand how maintaining a running maximum eliminates unnecessary comparisons.
- Practice optimizing solutions from **O(n²)** to **O(n)**.
- Recognize reverse traversal as a common technique in array-based interview problems.

---

**Difficulty:** 🟢 Easy  
**Language:** ☕ Java