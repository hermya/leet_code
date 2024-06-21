<h2 style="color:#F90;">45. Jump Game II</h2>

You are given a **0-indexed** array of integers `nums` of length `n`. You are initially positioned at `nums[0]`.

Each element `nums[i]` represents the maximum length of a forward jump from index `i`. In other words, if you are at `nums[i]`, you can jump to any `nums[i + j]` where:

* `0 <= j <= nums[i]` and
* `i + j < n`

Return *the minimum number of jumps to reach* `nums[n - 1]`. The test cases are generated such that you can reach `nums[n - 1]`.

**EXAMPLE**
>**Input**: nums = [2,3,0,1,4]
**Output**: 2

<p style="color:#007;">
<b>Explanation</b><br>
The minimum number of jumps to reach the last index is 2.<br> 
Jump 1 step from index 0 to 1, then 3 steps to the last index.
</p>

**[leetcode url](https://leetcode.com/problems/jump-game-ii/description)**
