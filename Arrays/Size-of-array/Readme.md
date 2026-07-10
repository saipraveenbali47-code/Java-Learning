# Get Size of an Array

## 📌 Problem Summary

Given an integer array, determine the total number of elements present in the array and return its size.

---

## 🎯 Objective

Find and return the length of the given array using Java.

---

## 📚 Concepts Used

- Arrays in Java
- `length` property
- Return statements

---

## 💡 Approach

1. Access the array's built-in `length` property.
2. Return the value as the size of the array.

Since Java stores the size of an array internally, retrieving it is a direct operation and does not require traversing the array.

---

## 📝 Algorithm

1. Receive the input array.
2. Access `arr.length`.
3. Return the obtained value.

---

## ⏱️ Time Complexity

**O(1)**

The length of an array is stored internally and can be accessed in constant time.

---

## 💾 Space Complexity

**O(1)**

No extra memory is used.

---


## 📖 Explanation

The `length` property of an array in Java returns the total number of elements stored in the array. Since this value is maintained by the JVM, it can be accessed instantly without iterating through the array.

---

## ✅ Example

### Input

```text
arr = [1, 2, 3]
```

### Output

```text
3
```

### Input

```text
arr = [1, 2, 3, 5, 4]
```

### Output

```text
5
```

---

## 🎓 Key Learning

- Every Java array has a built-in `length` property.
- The `length` property is used without parentheses (`arr.length`), unlike methods such as `String.length()`.
- Accessing the size of an array takes constant time.

---

**Difficulty:** 🟢 Easy  
**Language:** Java