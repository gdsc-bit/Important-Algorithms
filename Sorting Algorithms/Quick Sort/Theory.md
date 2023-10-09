## Quicksort

Quicksort uses the divide-and-conquer algorithmic technique to sort elements. It is an in-place sorting algorithm but it is not stable. In its best and average case, it has a time complexity of O(nlogn). Its worst case time complexity is O(n^2).

#### Steps for Quicksort:

- Choose an element ('pivot').
- Rearrange the array until a point of division is found such that when pivot is placed there, elements to the left are smaller than pivot and elements to the right are greater than pivot. This will also be the correct postion of pivot in the final sorted array.
- Move pivot to that position.
- This splits the array into two subarrays.
- Apply these steps to the two subarrays recursively until the entire array is sorted.
