<h2 style="color:#F90;">1448. Count Good Nodes in Binary Tree</h2>

Given a binary tree `root`, a node X in the tree is named **good** if in the path from root to X there are no nodes with a value greater than X.

Return the number of **good** nodes in the binary tree.

**EXAMPLE**
<img src="https://assets.leetcode.com/uploads/2020/04/02/test_sample_1.png"></img>
>**Input**: root = [3,1,4,3,null,1,5]
**Output**: 4
<p style="color:#007;">
<b>Explanation</b><br>
Nodes in blue are <b>good</b>.<br>
Root Node (3) is always a good node.<br>
Node 4 -> (3,4) is the maximum value in the path starting from the root.<br>
Node 5 -> (3,4,5) is the maximum value in the path<br>
Node 3 -> (3,1,3) is the maximum value in the path.<br>
</p>

**[leetcode url](https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/)**