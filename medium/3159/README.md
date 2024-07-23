<h2 style="color:#F90;">3159. Find Occurrences of an Element in an Array</h2>

You are given an integer array `nums`, an integer array `queries`, and an integer `x`.

For each `queries[i]`, you need to find the index of the `queries[i]`^th^ occurrence of `x` in the `nums` array. If there are fewer than `queries[i]` occurrences of `x`, the answer should be -1 for that query.

Return an integer array answer containing the answers to all queries.

**EXAMPLE**
>**Input**: nums = [1,3,1,7], queries = [1,3,2,4], x = 1
**Output**: [0,-1,2,-1]
<p style="color:#007;">
<b>Explanation</b><br>
<ul style="color:#007;">
<li>For the 1st query, the first occurrence of 1 is at index 0.
</li><li>For the 2nd query, there are only two occurrences of 1 in nums, so the answer is -1.
</li><li>For the 3rd query, the second occurrence of 1 is at index 2.
</li><li>For the 4th query, there are only two occurrences of 1 in nums, so the answer is -1.
</li></ul>
</p>

**[leetcode url](https://leetcode.com/problems/find-occurrences-of-an-element-in-an-array/description/)**