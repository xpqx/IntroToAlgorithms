# Readme for directory Ch32
corresponding to chapter 32 of Intro to algos by Cormen.

This Chapter focuses on String Matching algorithms and consists
of 4 sections, each of which focus on a particular algorithm that
solves the string matching problem.

# The String-Matching Problem

Given a pattern of text, P, and a text, T, find all
occurrences of P in T. Both P and T are considered arrays
of characters in some alphabet

For example, letting  T = "abcabaadcdada" and P= "abaa" and
assuming zero-based array-indexing, P occurs 1 start at the
4th character of T and no where else.

# TODO

- [ ] implement the naive string matching algorithm
   - [x] implement naive-string-matcher in lua
   - [x] implement naive-string matcher in C++
   - [ ] implement naive-string matcher in java
- [ ] implement Rabin-Karp string matching algorithm
   - [x] implement Rabin-Karp in lua
   - [ ] implement Rabin-Karp matcher in C++
   - [ ] implement Rabin-Karp matcher in java
- [ ] implement Knuth-Morris-Pratt
- [ ] implement finite-automata matching algorithm
- [ ] answer a selection of the exercises
- [ ] check wiki for the most up-to-date algorithm on string-matching
       and implement that
