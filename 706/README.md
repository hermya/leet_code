<h2 style="color:#0C9;">703. Kth Largest Element in a Stream</h2>

Design a class to find the `kth` largest element in a stream. Note that it is the `kth` largest element in the sorted order, not the `kth` distinct element.

Implement `KthLargest` class:

* `KthLargest(int k, int[] nums)` Initializes the object with the integer `k` and the stream of integers `nums`.
* `int add(int val)` Appends the integer `val` to the stream and returns the element representing the `kth` largest element in the stream.

**EXAMPLE**
> **Input**
["KthLargest", "add", "add", "add", "add", "add"]
\[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
> **Output**
[null, 4, 5, 5, 8, 8]



<p style="color:#007;">
<b>Explanation</b><br>
KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);<br>
kthLargest.add(3);   // return 4<br>
kthLargest.add(5);   // return 5<br>
kthLargest.add(10);  // return 5<br>
kthLargest.add(9);   // return 8<br>
kthLargest.add(4);   // return 8<br>
</p>

**[leetcode url](https://leetcode.com/problems/kth-largest-element-in-a-stream/description/)**
