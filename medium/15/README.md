<h2 style="color:#F90;">15. 3Sum</h2>

Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

**EXAMPLE**
>**Input**: nums = [-1,0,1,2,-1,-4]
**Output**: \[[-1,-1,2],[-1,0,1]]

<p style="color:#007;">
<b>Explanation</b><br>
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.<br>
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.<br>
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.<br>
The distinct triplets are [-1,0,1] and [-1,-1,2].<br>
Notice that the order of the output and the order of the triplets does not matter.
</p>

**[leetcode url](https://leetcode.com/problems/3sum/description)**