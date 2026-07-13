# Print Array Elements

## 📌 Problem Summary

Given an integer array, print all its elements in the same order, separated by a single space.

---

## 🎯 Objective

Traverse the array and display each element separated by a space without printing an extra newline at the end.

---

## 📚 Concepts Used

- Arrays in Java
- Traversing an array
- `for` loop
- Output formatting

---

## 💡 Approach

1. Start from the first element of the array.
2. Traverse the array using a loop.
3. Print each element followed by a space.
4. Continue until all elements have been printed.

---

## 📝 Algorithm

1. Receive the input array.
2. Iterate from index `0` to `arr.length - 1`.
3. Print the current element followed by a space.
4. End after printing all elements.

---

## ⏱️ Time Complexity

**O(n)**

Each element of the array is visited exactly once.

---

## 💾 Space Complexity

**O(1)**

No additional data structures are used.

---

## 💻 Java Solution

```java
class Solution {
    public static void printArray(int arr[]) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
```

---

## 📖 Explanation

The solution traverses the array using a loop and prints every element in sequence. Each element is followed by a space to maintain the required output format.

---

## ✅ Example

### Input

```text
arr = [54, 43, 2, 1, 5]
```

### Output

```text
54 43 2 1 5
```

### Input

```text
arr = [324, 5, 2, 2]
```

### Output

```text
324 5 2 2
```

---

## 🎓 Key Learning

- Learn how to traverse an array efficiently.
- Understand the use of loops for processing array elements.
- Practice formatted output in Java.
- Enhanced `for-each` loops provide a clean way to iterate through arrays when the index is not required.

---

**Difficulty:** 🟢 Easy  
**Language:** Java