<h2 style="color:#F90;">134. Gas Station</h2>
Given a reference of a node in a connected undirected graph.

Return a [**deep copy**](https://en.wikipedia.org/wiki/Object_copying#Deep_copy) (clone) of the graph.

Each node in the graph contains a value (`int`) and a list (`List[Node]`) of its neighbors.
```
class Node {
    public int val;
    public List<Node> neighbors;
}
```
**Test case format:**

For simplicity, each node's value is the same as the node's index (1-indexed). For example, the first node with `val == 1`, the second node with `val == 2`, and so on. The graph is represented in the test case using an adjacency list.

**An adjacency list** is a collection of unordered **lists** used to represent a finite graph. Each list describes the set of neighbors of a node in the graph.

The given node will always be the first node with `val = 1`. You must return the **copy of the given node** as a reference to the cloned graph.

**EXAMPLE**
![](https://assets.leetcode.com/uploads/2019/11/04/133_clone_graph_question.png)
>**Input**: adjList = \[[2,4],[1,3],[2,4],[1,3]]
**Output**: \[[2,4],[1,3],[2,4],[1,3]]

<p style="color:#007;">
<b>Explanation</b><br>
There are 4 nodes in the graph.<br>
1st node (val = 1)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).<br>
2nd node (val = 2)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).<br>
3rd node (val = 3)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).<br>
4th node (val = 4)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
</p>

**[leetcode url](https://leetcode.com/problems/clone-graph/description/)**
