# Prim's Algorithm

In this tutorial, you will learn how Prim's Algorithm works. Also, you will find working examples of Prim's Algorithm in C, C++, Java and Python.

Prim's algorithm is a minimum spanning tree algorithm that takes a graph as input and finds the subset of the edges of that graph which

>form a tree that includes every vertex

>has the minimum sum of weights among all the trees that can be formed from the graph

### How Prim's algorithm works

It falls under a class of algorithms called greedy algorithms that find the local optimum in the hopes of finding a global optimum.

We start from one vertex and keep adding edges with the lowest weight until we reach our goal.

The steps for implementing Prim's algorithm are as follows:

1. Initialize the minimum spanning tree with a vertex chosen at random.
2. Find all the edges that connect the tree to new vertices, find the minimum and add it to the tree
3. Keep repeating step 2 until we get a minimum spanning tree
### Example of Prim's algorithm

![image](https://user-images.githubusercontent.com/88281326/198711183-9b5cda68-3120-495b-aad2-6c56635d4199.png)

>                                                    Start with a weighted graph
  
  ![image](https://user-images.githubusercontent.com/88281326/198711584-a44e05d9-b9c2-4b2c-a3f6-743660180ee3.png)

>                                                         Choose a vertex

![image](https://user-images.githubusercontent.com/88281326/198712291-b40c2703-8d29-499b-b3e7-fac63bbd35a4.png)

>                                             Choose the shortest edge from this vertex and add it

![image](https://user-images.githubusercontent.com/88281326/198712430-c71d95da-a347-4be9-9a13-016c36760b88.png)

>                                              Choose the nearest vertex not yet in the solution

![image](https://user-images.githubusercontent.com/88281326/198712644-2055d05e-be19-4728-8f2e-f6ec0450c8fb.png)

>                       Choose the nearest edge not yet in the solution, if there are multiple choices, choose one at random

![image](https://user-images.githubusercontent.com/88281326/198712704-6aa5f885-3c8f-4440-bfa3-b4eb58f60e6d.png)

>                                                   Repeat until you have a spanning tree
### Prim's Algorithm pseudocode
The pseudocode for prim's algorithm shows how we create two sets of vertices U and V-U. U contains the list of vertices that have been visited and V-U the list of vertices that haven't. One by one, we move vertices from set V-U to set U by connecting the least weight edge.
```
T = ∅;
U = { 1 };
while (U ≠ V)
    let (u, v) be the lowest cost edge such that u ∈ U and v ∈ V - U;
    T = T ∪ {(u, v)}
    U = U ∪ {v} 
```
