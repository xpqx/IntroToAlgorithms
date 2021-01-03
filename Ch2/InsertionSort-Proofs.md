# Proof of Correctness

This implementation differs slightly from the
book. Then main differences are that here, we
use a comparator function defined at line 3.

## Initialization
  We define the loop invariant to be the sorted
  subarray 'a[1..j]'. At the first iteration,
  i is 2 and a[1..i] is just a one-element subarray
  which is trivially ordered

## Maintenance
  Assume step i has just occured and we now show step i+1
  maintains the loop invariant. At line 21, j=i+1 and the
  key=a[i+1]. The while condition checks that key<a[j-1]
  and j>1. If both those are true, we move swap the contents
  of a[j] with a[j-1] and decrement j. The while loop exits
  when j is down to the first element of the array or when
  key>=a[j-1].

## Termination
  The main while loop at line 18 is guaranteed to end because
  i is being increased at each iteration. The while loop at line 21
  is also guaranteed to end because the j is being decreased


## Time Complexity
  Big O(n^2)

## Space Complexity
  Big O(1); the algorithm sorts inplace.