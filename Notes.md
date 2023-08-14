# Data Structures and Algorithms

I created this repo to store my notes and implementations of data structures and algos in Java.

## What's a data structure?

Data structure: a named location that can be used to store and organize data (declarative).

example: array (a collection of elements stored at contiguous memory locations)

## What's an algorithm?
Algorithm: a collection of steps to solve a problem (imperative).


## 4 Rules for Big O Notation

1. Different steps get added.

2. Drop constants. For example, you can't have O(2n) because of the constant 2, and you must drop it. Therefore it becomes O(n).

3. Different inputs => different variables. For example, if you have 2 inputs, a and b, you can't have O(n^2) because the a and b will not always be the same. It should instead be O(a * b).

4. Drop non-dominant terms. For example, if you have O(n + n^2), you must drop the n since n^2 is greater than n. Therefore it becomes O(n^2).





