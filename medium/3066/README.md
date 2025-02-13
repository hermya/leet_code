<h2 style="color:#F90;">3066. Minimum Operations to Exceed Threshold Value II</h2>

You are given a **0-indexed** integer array `nums`, and an integer `k`.

In one operation, you will:

-   Take the two smallest integers `x` and `y` in `nums`.
-   Remove `x` and `y` from `nums`.
-   Add `min(x, y) * 2 + max(x, y)` anywhere in the array.

**Note** that you can only apply the described operation if `nums` contains at least two elements.

Return _the **minimum** number of operations needed so that all elements of the array are greater than or equal to_ `k`.

**EXAMPLE**
>**Input**: nums = [2,11,10,1,3], k = 10
**Output**: 2

<p style="color:#007;">
<b>Explanation</b><br>
<pre>
In the first operation, we remove elements 1 and 2, then add 1 * 2 + 2 to nums. nums becomes equal to [4, 11, 10, 3].
In the second operation, we remove elements 3 and 4, then add 3 * 2 + 4 to nums. nums becomes equal to [10, 11, 10].
At this stage, all the elements of nums are greater than or equal to 10 so we can stop.
It can be shown that 2 is the minimum number of operations needed so that all elements of the array are greater than or equal to 10.
</pre>
</p>

**[leetcode url](https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii)**
