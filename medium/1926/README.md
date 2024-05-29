<h2 style="color:#F90;">1926. Nearest Exit from Entrance in Maze</h2>

You are given an `m x n` matrix `maze` (**0-indexed**) with empty cells (represented as `'.'`) and walls (represented as `'+'`). You are also given the `entrance` of the maze, where `entrance = [entrancerow, entrancecol]` denotes the row and column of the cell you are initially standing at.

In one step, you can move one cell **up**, **down**, **left**, or **right**. You cannot step into a cell with a wall, and you cannot step outside the maze. Your goal is to find the **nearest exit** from the `entrance`. An **exit** is defined as an **empty cell** that is at the **border** of the `maze`. The `entrance` does **not count** as an exit.

Return *the **number of steps** in the shortest path from the* `entrance` *to the nearest exit, or* `-1` *if no such path exists*.

**EXAMPLE**
<img src="https://assets.leetcode.com/uploads/2021/06/04/nearest1-grid.jpg"></img>
>**Input**:  maze = \[["+","+",".","+"],[".",".",".","+"],["+","+","+","."]], entrance = [1,2]
**Output**: 1
<p style="color:#007;">
<b>Explanation</b><br>
There are 3 exits in this maze at [1,0], [0,2], and [2,3].<br>
Initially, you are at the entrance cell [1,2].<br>
- You can reach [1,0] by moving 2 steps left.<br>
- You can reach [0,2] by moving 1 step up.<br>
It is impossible to reach [2,3] from the entrance.<br>
Thus, the nearest exit is [0,2], which is 1 step away.<br>
</p>

**[leetcode url](https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/description/)**