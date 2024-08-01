<h2 style="color:#F90;">63. Unique Paths II</h2>

You are given an `m x n` integer array `grid`. There is a robot initially located at the **top-left corner** (i.e., `grid[0][0]`). The robot tries to move to the **bottom-right corner** (i.e., `grid[m - 1][n - 1]`). The robot can only move either down or right at any point in time.

An obstacle and space are marked as `1` or `0` respectively in `grid`. A path that the robot takes cannot include **any** square that is an obstacle.

Return _the number of possible unique paths that the robot can take to reach the bottom-right corner_.

The testcases are generated so that the answer will be less than or equal to `2 * 109`

**EXAMPLE**
![](https://assets.leetcode.com/uploads/2020/11/04/robot1.jpg)
>**Input**: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
**Output**: 2

<p style="color:#007;">
<b>Explanation</b><br>
There is one obstacle in the middle of the 3x3 grid above.<br>
There are two ways to reach the bottom-right corner:<br>
1. Right -> Right -> Down -> Down<br>
2. Down -> Down -> Right -> Right
</p>

**[leetcode url](https://leetcode.com/problems/unique-paths-ii/description)**