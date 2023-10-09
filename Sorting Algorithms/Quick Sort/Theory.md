## Quicksort

Quicksort uses the divide-and-conquer algorithmic technique to sort elements. An element ('pivot') is selected from the array and array is partitioned into two sub-arrays, according to whether they are less than or greater than it. The subarrays are recursively sorted by applying quicksort to each of them.

Quicksort is in-place but it is not stable.

In its best and average case, it has a time complexity of O(nlogn). Its worst case time complexity is O(n^2).

#### Steps for Quicksort:

- Choose an element ('pivot').
- Rearrange array so that the correct postion of pivot in the final sorted array is found, and once pivot is moved here, elements to left of pivot are smaller than it and elements to the right of pivot are greater than it (they do not have to be sorted yet).
- This splits the array into two subarrays.
- Apply these steps to the two subarrays also recursively until the entire array is sorted.
