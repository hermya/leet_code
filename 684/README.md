<h2 style="color:#F90;">684. Redundant Connection</h2>

In this problem, a tree is an **undirected graph** that is **connected** and has **no cycles**.

You are given a graph that started as a tree with n nodes labeled from 1 to n, with **one additional edge** added. The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed. The graph is represented as an array edges of length n where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the graph.

Return an **edge that can be removed** so that the **resulting graph is a tree of n nodes**. If there are multiple answers, return the answer that occurs last in the input.

*Note that*
1. Nodes are labelled in optimized manner. i.e. node label <= edges.length
3. There's only one edge that makes the tree a cyclic graph. Hence, <span style="color:#C00;"><b> the first edge you find, is the final answer</b></span> 

**EXAMPLE**

<img src="https://assets.leetcode.com/uploads/2021/05/02/reduntant1-1-graph.jpg"></img>
>**Input**: edges = \[[1,2],[1,3],[2,3]]
**Output**: [2,3]

<p style="color:#077;">
<b>Solution details</b><br>
While solving this problem, I was also learning how to better your implementation of graph and followed two thumb rules:
<ul>
    <li>Arrays over collections as sequential memory is accessed faster</li>
    <li>Check out data-types used and try to limit them to your usecase</li>
</ul>
</p>
<p style="color:#077;">
To follow this, I started with graph implementation using HashMap, which took <b>88ms</b> of runtime<br>
Then I shifted to a solution using an array of ArrayList, which took <b>5ms</b> of runtime<br>
To make this even faster, I used array of array instead of ArrayList, which took <b>3ms</b> of runtime<br>
</p>

**[leetcode url](https://leetcode.com/problems/redundant-connection/description/)**
