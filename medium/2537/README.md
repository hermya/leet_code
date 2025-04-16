<h2 style="color:#F90;">2537. Count the Number of Good Subarrays</h2>

Given an integer array `nums` and an integer `k`, return _the number of **good** subarrays of_ `nums`.

A subarray `arr` is **good** if there are **at least** `k` pairs of indices `(i, j)` such that `i < j` and `arr[i] == arr[j]`.

A **subarray** is a contiguous **non-empty** sequence of elements within an array.

**EXAMPLE**
>**Input**: nums = [3,1,4,3,2,2,4], k = 2
**Output**: 4

<p style="color:#007;">
<b>Explanation</b><br>
<pre>
- [3,1,4,3,2,2] that has 2 pairs.
- [3,1,4,3,2,2,4] that has 3 pairs.
- [1,4,3,2,2,4] that has 2 pairs.
- [4,3,2,2,4] that has 2 pairs.
</pre>
</p>

**[leetcode url](https://leetcode.com/problems/count-the-number-of-good-subarrays/description/n)**