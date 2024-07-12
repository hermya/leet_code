<h2 style="color:#F90;">173. Binary Search Tree Iterator</h2>

Implement the `BSTIterator` class that represents an iterator over the **[in-order traversal](https://en.wikipedia.org/wiki/Tree_traversal#In-order_(LNR))** of a binary search tree (BST):

-   `BSTIterator(TreeNode root)` Initializes an object of the `BSTIterator` class. The `root` of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
-   `boolean hasNext()` Returns `true` if there exists a number in the traversal to the right of the pointer, otherwise returns `false`.
-   `int next()` Moves the pointer to the right, then returns the number at the pointer.

Notice that by initializing the pointer to a non-existent smallest number, the first call to `next()` will return the smallest element in the BST.

You may assume that `next()` calls will always be valid. That is, there will be at least a next number in the in-order traversal when `next()` is called.

**EXAMPLE**
![](https://assets.leetcode.com/uploads/2018/12/25/bst-tree.png)
>**Input**
["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
\[\[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
**Output**
[null, 3, 7, true, 9, true, 15, true, 20, false]

<p style="color:#007;">
<b>Explanation</b><br>
BSTIterator bSTIterator = new BSTIterator([7, 3, 15, null, null, 9, 20]);<br>
bSTIterator.next();    // return 3<br>
bSTIterator.next();    // return 7<br>
bSTIterator.hasNext(); // return True<br>
bSTIterator.next();    // return 9<br>
bSTIterator.hasNext(); // return True<br>
bSTIterator.next();    // return 15<br>
bSTIterator.hasNext(); // return True<br>
bSTIterator.next();    // return 20<br>
bSTIterator.hasNext(); // return False<br>
</p>

**[leetcode url](https://leetcode.com/problems/binary-search-tree-iterator/description)**