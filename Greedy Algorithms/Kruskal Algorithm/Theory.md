## Kruskal's algorithm

Kruskal's Algorithm is used to find the minimum spanning tree for a connected weighted graph. The main target of the algorithm is to find the subset of edges by using which we can traverse every vertex of the graph. It follows the greedy approach that finds an optimum solution at every stage instead of focusing on a global optimum.

#### How does Kruskal's algorithm work?
<p>
<li>In Kruskal's algorithm, we start from edges with the lowest weight and keep adding the edges until the goal is reached. The steps to implement Kruskal's algorithm are listed as follows -
First, sort all the edges from low weight to high.</li>
<li>Now, take the edge with the lowest weight and add it to the spanning tree. If the edge to be added creates a cycle, then reject the edge.</li>
<li>Continue to add the edges until we reach all vertices, and a minimum spanning tree is created.</li>
 </p>

#### The applications of Kruskal's algorithm are -
<p>
  <li>Kruskal's algorithm can be used to layout electrical wiring among cities.</li>
<li>It can be used to lay down LAN connections</li>
  </p>

#### ALGORITHM
>Step 1: Create a forest F in such a way that every vertex of the graph is a separate tree.  
Step 2: Create a set E that contains all the edges of the graph.  
Step 3: Repeat Steps 4 and 5 while E is NOT EMPTY and F is not spanning  
Step 4: Remove an edge from E with minimum weight  
Step 5: IF the edge obtained in Step 4 connects two different trees, then add it to the forest F   
(for combining two trees into one tree).  
ELSE  
Discard the edge  
Step 6: END  

#### Complexity of Kruskal's algorithm
Time Complexity
The time complexity of Kruskal's algorithm is O(E logE) or O(V logV), where E is the no. of edges, and V is the no. of vertices.
