<h2 style="color:#0C9;">234. Palindrome Linked List</h2>

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

**EXAMPLE**
<img src="https://assets.leetcode.com/uploads/2021/03/03/pal1linked-list.jpg"></img>
>**Input**: head = [1,2,2,1]
**Output**: true


<p style="color:#077;">
<b>Solution Details</b><br>
There are multiple approaches to solve this question, but to achieve it in O(1) space, the ListNodes must be reused<br>
Our solution divides the list in two halves, reverses the second halves and serially checks if it is equal. Runtime for this solution is <b>4ms</b> 
</p>

**[leetcode url](https://leetcode.com/problems/palindrome-linked-list/description/)**
