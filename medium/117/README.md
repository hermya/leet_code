<h2 style="color:#F90;">117. Populating Next Right Pointers in Each Node II</h2>

Given a binary tree

```
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
```

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to `NULL`.

Initially, all next pointers are set to `NULL`.

**EXAMPLE**
![](https://assets.leetcode.com/uploads/2019/02/15/117_sample.png)
>**Input**: root = [1,2,3,4,5,null,7]
**Output**: [1,#,2,3,#,4,5,7,#]

<p style="color:#007;">
<b>Explanation</b><br>
Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
</p>

**[leetcode url](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description)**