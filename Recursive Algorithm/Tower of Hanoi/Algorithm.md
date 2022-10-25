## Tower of Hanoi 
It is a mathematical puzzel, and the objective of the puzzel is to move the entire stack to another rod.  

## Rules to solve the Problem of Tower of Hanoi  
1. Only one disk may be moved at a time. 
2. Each move consist of taking the upper disk from one of the rod and sliding it onto another rod, on the top of other disk that may already be present on that rod. 
3. No disk may be placed on the top of smaller disk.  

![image](https://i.ibb.co/jvhMM1h/tower-of-hanoi.gif)  



## Logic to solve the Problem 
Steps: 
1. Move the top n-1 disk from source(starting) to auxillary(middle) tower. 
2. Move the nth disk from source to destination tower. 
3. Move n-1 disk from auxillary tower to destination tower. 
4. Transferring top n-1 disks from source to auxillary tower can again be thought as a fresh problem and can be solved in the same manner(using the concept of Recursion) 

<img src="https://i.ibb.co/X5WcL9R/tower-of-hanoi-two-disks.gif">
