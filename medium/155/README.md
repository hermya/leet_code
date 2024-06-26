<h2 style="color:#F90;">155. Min Stack</h2>

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the `MinStack` class:

-   `MinStack()` initializes the stack object.
-   `void push(int val)` pushes the element `val` onto the stack.
-   `void pop()` removes the element on the top of the stack.
-   `int top()` gets the top element of the stack.
-   `int getMin()` retrieves the minimum element in the stack.

You must implement a solution with `O(1)` time complexity for each function.

**EXAMPLE**
>**Input**
["MinStack","push","push","push","getMin","pop","top","getMin"]
\[[],[-2],[0],[-3],[],[],[],[]]
**Output**
[null,null,null,null,-3,null,0,-2]

<p style="color:#007;">
<b>Explanation</b><br>
MinStack minStack = new MinStack();<br>
minStack.push(-2);<br>
minStack.push(0);<br>
minStack.push(-3);<br>
minStack.getMin(); // return -3<br>
minStack.pop();<br>
minStack.top();    // return 0<br>
minStack.getMin(); // return -2<br>
</p>

**[leetcode url](https://leetcode.com/problems/min-stack/description/)**
