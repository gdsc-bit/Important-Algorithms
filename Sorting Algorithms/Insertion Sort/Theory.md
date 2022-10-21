## Insertion Sort Algorithm

Insertion sort is a sorting algorithm that places an unsorted element at its suitable place in each iteration.

Insertion sort works similarly as we sort cards in our hand in a card game.

In this sorting techinque, we assume that the first card is already sorted then, we select an unsorted card. If the unsorted card is greater than the card in hand, it is placed on the right otherwise, to the left. In the same way, other unsorted cards are taken and put in their right place.

A similar approach is used by insertion sort.

## Working of Insertion Sort
Suppose we need to sort the following array.

![image](https://user-images.githubusercontent.com/90500919/197248504-46fdd8d4-26a6-488f-a983-01d274fdb630.png)
>                                            Initial array

1. The first element in the array is assumed to be sorted. Take the second element and store it separately in key.
      Compare key with the first element. If the first element is greater than key, then key is placed in front of the first element.
      
      ![image](https://user-images.githubusercontent.com/90500919/197250494-6be1fd6b-5ce7-4bf9-a3c7-eac6d24d795a.png)

>     If the first element is greater than key, then key is placed in front of the first element.
2. If the first element is greater than key, then key is placed in front of the first element.
    Now, the first two elements are sorted.
    Take the third element and compare it with the elements on the left of it. Placed it just behind the element smaller than it. If there is no element smaller than it, then place it at the beginning of the array.

![image](https://user-images.githubusercontent.com/90500919/197263581-e092c8c3-bf5b-4a3c-915c-c9548528b79f.png)

>                                                      Place 1 at the beginning
3. Similarly, place every unsorted element at its correct position.
  ![image](https://user-images.githubusercontent.com/90500919/197263997-51490a70-88a2-48e0-af62-f3f83f91cd4e.png)

>                                                       Place 4 behind 1

![image](https://user-images.githubusercontent.com/90500919/197264160-9c225dd5-afa1-48bf-abcd-9b25cc0f7aa7.png)

>                                               Place 3 behind 1 and the array is sorted


### Insertion Sort Algorithm
```
insertionSort(array)
  mark first element as sorted
  for each unsorted element X
    'extract' the element X
    for j <- lastSortedIndex down to 0
      if current element j > X
        move sorted element to the right by 1
    break loop and insert X here
end insertionSort
```
