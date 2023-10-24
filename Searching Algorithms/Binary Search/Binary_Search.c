// Detail: Program for searching an element in the integer array using binary search
// Author: Rishika Snehi
// Note:   Uncomment print statements for debugging or understanding the flow

#include <stdio.h>

int binarySearch(int arr[], int target, int arr_len)
{
    // initialize start & end
    int start = 0;
    int end = arr_len - 1;

    // loop start start pointer is before end pointer
    while (start <= end)
    {
        // find mid element
        // using int overflow safe formula for computing middle index
        int mid = start + ((end - start) / 2);
        // printf("mid: %d\n", mid);

        // compare mid element with target integer
        if (arr[mid] == target)
        {
            return mid;
        }
        else if (arr[mid] > target) // target is in first half of the array
        {
            end = mid - 1;
            // printf("start = %d end =%d\n", start, end);
        }
        else // target is in later half of the array
        {
            start = mid + 1;
            // printf("start = %d end =%d\n", start, end);
        }
    }

    // if we reached here, then it means that element was not found
    return -1;
}

int main()
{
    int arr[10] = {1, 12, 23, 34, 45, 56, 67, 78, 89, 90};
    int target;

    printf("input array: ");
    for (int i = 0; i < 10; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");

    printf("Enter the target number you want to search: ");
    scanf("%d", &target);

    int arr_len = sizeof(arr) / sizeof(arr[0]);

    int pos = binarySearch(arr, target, arr_len);
    if (pos != -1)
        printf("The target number is present in array at %dth position", pos);
    else
        printf("element not found in the array\n");
}
