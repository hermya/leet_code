<h2 style="color:#F90;">3355. Zero Array Transformation I</h2>

You are given an integer array `nums` of length `n` and a 2D array `queries`, where `queries[i] = [li, ri]`.

For each `queries[i]`:

-   Select a subset of indices within the range `[li, ri]` in `nums`.
-   Decrement the values at the selected indices by 1.

A **Zero Array** is an array where all elements are equal to 0.

Return `true` if it is _possible_ to transform `nums` into a **Zero Array** after processing all the queries sequentially, otherwise return `false`.

**EXAMPLE 1**
>**Input**: nums = [1,0,1], queries = \[[0,2]]
**Output**: true
<p style="color:#007;">
<b>Explanation</b>
<pre>
For i = 0:
Select the subset of indices as [0, 2] and decrement the values at these indices by 1.
The array will become [0, 0, 0], which is a Zero Array.
</pre>
</p>

**EXAMPLE 2**
>**Input**: nums = [4,3,2,1], queries = \[[1,3],[0,2]]
**Output**: false
<p style="color:#007;">
<b>Explanation</b>
<pre>
For i = 0:
Select the subset of indices as [1, 2, 3] and decrement the values at these indices by 1.
The array will become [4, 2, 1, 0].
For i = 1:
Select the subset of indices as [0, 1, 2] and decrement the values at these indices by 1.
The array will become [3, 1, 0, 0], which is not a Zero Array.
</pre>
</p>

**[leetcode url](https://leetcode.com/problems/zero-array-transformation-i/description/)**