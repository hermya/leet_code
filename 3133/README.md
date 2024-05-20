<h2 style="color:#F90;">3133. Minimum Array End</h2>

You are given two integers `n` and `x`. You have to construct an array of **positive** integers nums of size n where for every `0 <= i < n - 1`, `nums[i + 1]` is **greater than** `nums[i]`, and the result of the bitwise `AND` operation between all elements of `nums` is `x`.

Return the **minimum** possible value of `nums[n - 1]`.

**EXAMPLE**
>**Input**: n = 3, x = 4
**Output**: 6

<p style="color:#007;">
<b>Explanation</b><br>
nums can be [4,5,6] and its last element is 6.
</p>

**[leetcode url](https://leetcode.com/problems/minimum-array-end/description/)**