<h2 style="color:#F90;">1222. Queens That Can Attack the King</h2>

On a **0-indexed** `8 x 8` chessboard, there can be multiple black queens and one white king.

You are given a 2D integer array `queens` where `queens[i] = [xQueeni, yQueeni]` represents the position of the `ith` black queen on the chessboard. You are also given an integer array `king` of length `2` where `king = [xKing, yKing]` represents the position of the white king.

Return _the coordinates of the black queens that can directly attack the king_. You may return the answer in **any order**.

**EXAMPLE**
![](https://assets.leetcode.com/uploads/2022/12/21/chess1.jpg)
>**Input**: queens = \[[0,1],[1,0],[4,0],[0,4],[3,3],[2,4]], king = [0,0]
**Output**: \[[0,1],[1,0],[3,3]]

<p style="color:#007;">
<b>Explanation</b><br>
The diagram above shows the three queens that can directly attack the king and the three queens that cannot attack the king (i.e., marked with red dashes).
</p>

**[leetcode url](https://leetcode.com/problems/queens-that-can-attack-the-king/description/)**
