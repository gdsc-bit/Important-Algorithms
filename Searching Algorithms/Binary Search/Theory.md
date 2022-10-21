### Binary Search

In this tutorial, you will learn how Binary Search sort works. Also, you will find working examples of Binary Search in C, C++, Java and Python.

Binary Search is a searching algorithm for finding an element's position in a sorted array.

In this approach, the element is always searched in the middle of a portion of an array.

>Binary search can be implemented only on a sorted list of items. If the elements are not sorted already, we need to sort them first.

### Binary Search Working

Binary Search Algorithm can be implemented in two ways which are discussed below.

1. Iterative Method
2. Recursive Method

The recursive method follows the divide and conquer approach.

The general steps for both methods are discussed below.

1. The array in which searching is to be performed is:

![image](https://user-images.githubusercontent.com/90500919/197272558-64dd3512-eac9-44bf-b9ff-c8f83453727c.png)

>                                        Initial array

   Let x = 4 be the element to be searched.

2. Set two pointers low and high at the lowest and the highest positions respectively.
![image](https://user-images.githubusercontent.com/90500919/197272764-4b1e2e42-7b09-4cd8-931b-401ab4974f12.png)
>                                        Setting pointers

3. Find the middle element mid of the array ie. arr[(low + high)/2] = 6.
![image](https://user-images.githubusercontent.com/90500919/197272935-5c9eb228-91a6-4171-bbde-973d93371aba.png)
>                                          Mid element
4. If x == mid, then return mid.Else, compare the element to be searched with m.
5. If x > mid, compare x with the middle element of the elements on the right side of mid. This is done by setting low to low = mid + 1.
6. Else, compare x with the middle element of the elements on the left side of mid. This is done by setting high to high = mid - 1.
![image](https://user-images.githubusercontent.com/90500919/197273045-ecf79412-29de-4237-a1d7-341bb5a66b3d.png)
>                                        Finding mid element
7. Repeat steps 3 to 6 until low meets high.

![image](https://user-images.githubusercontent.com/90500919/197273363-79dc9c4b-9cde-41fd-9f63-233f5c200b79.png)
>              Mid element

8. x = 4 is found.

![image](https://user-images.githubusercontent.com/90500919/197273419-88b76e9c-e03b-4ed6-baad-24a799428fc4.png)
>                 Found

### Binary Search Algorithm
Iteration Method
```
do until the pointers low and high meet each other.
    mid = (low + high)/2
    if (x == arr[mid])
        return mid
    else if (x > arr[mid]) // x is on the right side
        low = mid + 1
    else                       // x is on the left side
        high = mid - 1
```

Recursive Method
```
binarySearch(arr, x, low, high)
    if low > high
        return False 
    else
        mid = (low + high) / 2 
        if x == arr[mid]
            return mid
        else if x > arr[mid]        // x is on the right side
            return binarySearch(arr, x, mid + 1, high)
        else                               // x is on the right side
            return binarySearch(arr, x, low, mid - 1)
```
