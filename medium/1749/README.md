<h2 style="color:#F90;">1749. Maximum Absolute Sum of Any Subarray</h2>

You are given an integer array `nums`. The **absolute sum** of a subarray `[numsl, numsl+1, ..., numsr-1, numsr]` is `abs(numsl + numsl+1 + ... + numsr-1 + numsr)`.

Return _the **maximum** absolute sum of any **(possibly empty)** subarray of_ `nums`.

Note that `abs(x)` is defined as follows:

-   If `x` is a negative integer, then `abs(x) = -x`.
-   If `x` is a non-negative integer, then `abs(x) = x`.

**EXAMPLE**
>**Input**: nums = [2,-5,1,-4,3,-2]
**Output**: 8

<p style="color:#007;">
<b>Explanation</b><br>
The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.
</p>

**[leetcode url](https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/description)**