<h2 style="color:#F90;">2130. Maximum Twin Sum of a Linked List</h2>

In a linked list of size `n`, where `n` is **even**, the `i`^th^ node **(0-indexed)** of the linked list is known as the **twin** of the `(n-1-i)`^th^ node, if `0 <= i <= (n / 2) - 1`.

* For example, if `n = 4`, then node `0` is the twin of node `3`, and node `1` is the twin of node `2`. These are the only nodes with twins for `n = 4`.

The **twin sum** is defined as the sum of a node and its twin.

Given the `head` of a linked list with even length, return *the **maximum twin** sum of the linked list*.

**EXAMPLE**
<img src="https://assets.leetcode.com/uploads/2021/12/03/eg1drawio.png"/>
>**Input**: head = [5,4,2,1]
**Output**: 6

<p style="color:#007;">
<b>Explanation</b><br>
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.<br>
There are no other nodes with twins in the linked list.<br>
Thus, the maximum twin sum of the linked list is 6. <br>
</p>

**[leetcode url](https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description)**