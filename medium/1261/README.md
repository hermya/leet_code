<h2 style="color:#F90;">1261. Find Elements in a Contaminated Binary Tree</h2>

Given a binary tree with the following rules:

1.  `root.val == 0`
2.  For any `treeNode`:
    1.  If `treeNode.val` has a value `x` and `treeNode.left != null`, then `treeNode.left.val == 2 * x + 1`
    2.  If `treeNode.val` has a value `x` and `treeNode.right != null`, then `treeNode.right.val == 2 * x + 2`

Now the binary tree is contaminated, which means all `treeNode.val` have been changed to `-1`.

Implement the `FindElements` class:

-   `FindElements(TreeNode* root)` Initializes the object with a contaminated binary tree and recovers it.
-   `bool find(int target)` Returns `true` if the `target` value exists in the recovered binary tree.

**EXAMPLE**
![](https://assets.leetcode.com/uploads/2019/11/07/untitled-diagram-4-1-1.jpg)
>**Input**:
["FindElements","find","find","find","find"]
\[\[[-1,null,-1,-1,null,-1]],[2],[3],[4],[5]]
**Output**: [null,true,false,false,true]

<p style="color:#007;">
<b>Explanation</b><br>
<pre>
FindElements findElements = new FindElements([-1,null,-1,-1,null,-1]);
findElements.find(2); // return True
findElements.find(3); // return False
findElements.find(4); // return False
findElements.find(5); // return True
</pre></p>

**[leetcode url](https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/)**
