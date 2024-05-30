<h2 style="color:#F90;">450. Delete Node in a BST</h2>

Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return *the **root node reference** (possibly updated) of the BST*.

Basically, the deletion can be divided into two stages:

1. Search for a node to remove.
2. If the node is found, delete the node.

**EXAMPLE**
<img src="https://assets.leetcode.com/uploads/2020/09/04/del_node_1.jpg"></img>
>**Input**: root = [5,3,6,2,4,null,7], key = 3
**Output**: [5,4,6,2,null,null,7]
<p style="color:#007;">
<b>Explanation</b><br>
Given key to delete is 3. So we find the node with value 3 and delete it.<br>
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.<br>
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.<br><br>
<img src="https://assets.leetcode.com/uploads/2020/09/04/del_node_supp.jpg"></img>
</p>

**[leetcode url](https://leetcode.com/problems/delete-node-in-a-bst/description/)**