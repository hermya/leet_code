<h2 style="color:#0C9;">2815. Max Pair Sum in an Array</h2>

You are given a 0-indexed integer array nums. You have to find the maximum sum of a pair of numbers from nums such that the maximum digit in both numbers are equal.

Return the maximum sum or -1 if no such pair exists.

*Note that*
1. Numbers in a pair don't need to be adjacent
2. Only the max digit in both numbers need to be match
3. <span style="color:#C00;"><b>No need to match</b></span>: All digits, number of digits.

**EXAMPLE**
>**Input**: nums = [51,71,17,24,42]
**Output**: 88

<p style="color:#007;">
<b>Explanation</b><br>
For i = 1 and j = 2, nums[i] and nums[j] have equal maximum digits with a pair sum of 71 + 17 = 88. <br> 
For i = 3 and j = 4, nums[i] and nums[j] have equal maximum digits with a pair sum of 24 + 42 = 66. <br>
It can be shown that there are no other pairs with equal maximum digits, so the answer is 88. <br>
</p>

**[leetcode url](https://leetcode.com/problems/max-pair-sum-in-an-array/description/)**
