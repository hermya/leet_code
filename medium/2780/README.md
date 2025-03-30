<h2 style="color:#F90;">2780. Minimum Index of a Valid Split</h2>

An element `x` of an integer array `arr` of length `m` is **dominant** if **more than half** the elements of `arr` have a value of `x`.

You are given a **0-indexed** integer array `nums` of length `n` with one **dominant** element.

You can split `nums` at an index `i` into two arrays `nums[0, ..., i]` and `nums[i + 1, ..., n - 1]`, but the split is only **valid** if:

-   `0 <= i < n - 1`
-   `nums[0, ..., i]`, and `nums[i + 1, ..., n - 1]` have the same dominant element.

Here, `nums[i, ..., j]` denotes the subarray of `nums` starting at index `i` and ending at index `j`, both ends being inclusive. Particularly, if `j < i` then `nums[i, ..., j]` denotes an empty subarray.

Return _the **minimum** index of a **valid split**_. If no valid split exists, return `-1`.

**EXAMPLE**
>**Input**: nums = [2,1,3,1,1,1,7,1,2,1]
**Output**: 4

<p style="color:#007;">
<b>Explanation</b><br>
<pre>
We can split the array at index 4 to obtain arrays [2,1,3,1,1] and [1,7,1,2,1].
In array [2,1,3,1,1], element 1 is dominant since it occurs thrice in the array and 3 * 2 > 5.
In array [1,7,1,2,1], element 1 is dominant since it occurs thrice in the array and 3 * 2 > 5.
Both [2,1,3,1,1] and [1,7,1,2,1] have the same dominant element as nums, so this is a valid split.
It can be shown that index 4 is the minimum index of a valid split.
</pre>
</p>

**[leetcode url](https://leetcode.com/problems/minimum-index-of-a-valid-split/description/)**
