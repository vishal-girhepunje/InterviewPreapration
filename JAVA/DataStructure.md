# More Java Interview Questions (Part 2)

## Why are strings immutable in Java?

Strings are immutable in Java to ensure their security and integrity. Once a string is created, its value cannot be changed, preventing unintended modifications.

## What is the difference between creating a String using `new()` and as a literal?

- Using `new String()`: Creates a new string object in the heap memory, regardless of whether the content is already present in the string pool.
- String literal: Checks the string pool first, and if the string with the same value exists, it returns the reference to that string.

## What is the Collections Framework?

The Collections Framework in Java is a unified architecture for representing and manipulating collections of objects. It provides interfaces (like List, Set, Map) and classes (like ArrayList, HashSet) to store, retrieve, and manipulate data.

## What is the difference between ArrayList and LinkedList?

- **ArrayList**: Implements a dynamic array, good for random access.
- **LinkedList**: Implements a doubly-linked list, efficient for frequent insertions and deletions.

## What is the difference between a HashMap and a TreeMap?

- **HashMap**: Stores key-value pairs, not ordered.
- **TreeMap**: Stores key-value pairs in a sorted order based on the natural order or a custom comparator.

## What is the difference between a HashSet and a TreeSet?

- **HashSet**: Stores elements in random order, no duplicates allowed.
- **TreeSet**: Stores elements in sorted order, no duplicates allowed.

## What is the difference between an Iterator and a ListIterator?

- **Iterator**: Used to traverse a collection in a forward direction.
- **ListIterator**: Extends Iterator and allows bidirectional traversal.

## What is the purpose of the Comparable interface?

The Comparable interface in Java is used for defining the natural order of objects. It enables objects to be compared and sorted based on their inherent properties.

## What is the purpose of the `java.util.concurrent` package?

The `java.util.concurrent` package provides a framework for concurrent programming, offering high-level concurrency utilities to simplify the development of multithreaded applications.

