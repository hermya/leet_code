<h2 style="color:#F90;">98. Validate Binary Search Tree</h2>

Given the `root` of a binary tree, _determine if it is a valid binary search tree (BST)_.

A **valid BST** is defined as follows:

-   The left subtree of a node contains only nodes with keys **less than** the node's key.
-   The right subtree of a node contains only nodes with keys **greater than** the node's key.
-   Both the left and right subtrees must also be binary search trees.

**EXAMPLE**
![](https://assets.leetcode.com/uploads/2020/12/01/tree2.jpg)
>**Input**: root = [5,1,4,null,null,3,6]
**Output**: false

<p style="color:#007;">
<b>Explanation</b><br>
The root node's value is 5 but its right child's value is 4.
</p>

**[leetcode url](https://leetcode.com/problems/validate-binary-search-tree/description/)**
