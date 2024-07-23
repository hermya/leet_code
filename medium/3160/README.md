<h2 style="color:#F90;">Find the Number of Distinct Colors Among the Balls</h2>

You are given an integer `limit` and a 2D array `queries` of size `n x 2`.

There are `limit + 1` balls with **distinct** labels in the range `[0, limit]`. Initially, all balls are uncolored. For every query in `queries` that is of the form `[x, y]`, you mark ball `x` with the color `y`. After each query, you need to find the number of **distinct** colors among the balls.

Return an array `result` of length `n`, where `result[i]` denotes the number of distinct colors *after* `i`^th^ query.

**Note** that when answering a query, lack of a color will not be considered as a color.

**EXAMPLE**
>**Input**: limit = 4, queries = \[[1,4],[2,5],[1,3],[3,4]]
**Output**: [1,2,2,3]
<p style="color:#007;">
<b>Explanation</b><br>
<img src="https://assets.leetcode.com/uploads/2024/04/17/ezgifcom-crop.gif"></img>
<ul>
<li>After query 0, ball 1 has color 4.
</li>
<li>After query 1, ball 1 has color 4, and ball 2 has color 5.
</li>
<li>After query 2, ball 1 has color 3, and ball 2 has color 5.
</li>
<li>After query 3, ball 1 has color 3, ball 2 has color 5, and ball 3 has color 4.
</li>
</ul>
</p>

**[leetcode url](https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls/description/)**