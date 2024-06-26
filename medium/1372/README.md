<h2 style="color:#F90;">1372. Longest ZigZag Path in a Binary Tree</h2>

You are given the `root` of a binary tree.

A ZigZag path for a binary tree is defined as follow:
* Choose **any** node in the binary tree and a direction (right or left).
* If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
* Change the direction from right to left or from left to right.
* Repeat the second and third steps until you can't move in the tree.

Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).

Return *the longest **ZigZag** path contained in that tree*.

**EXAMPLE**
<img src="https://assets.leetcode.com/uploads/2020/01/22/sample_1_1702.png"></img>
>**Input**: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1]
**Output**: 3
<p style="color:#007;">
<b>Explanation</b><br>
Longest ZigZag path in blue nodes (right -> left -> right)
</p>

**[leetcode url](https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description)**