<h2 style="color:#F90;">399. Evaluate Division</h2>

You are given an array of variable pairs `equations` and an array of real numbers `values`, where `equations[i] = [Ai, Bi]` and `values[i]` represent the equation `Ai / Bi = values[i]`. Each `Ai` or `Bi` is a string that represents a single variable.

You are also given some `queries`, where `queries[j] = [Cj, Dj]` represents the `j`^th^ query where you must find the answer for `Cj / Dj = ?`.

Return *the answers to all queries*. If a single answer cannot be determined, return `-1.0`.

**Note**: The input is always valid. You may assume that evaluating the queries will not result in division by zero and that there is no contradiction.

**Note**: The variables that do not occur in the list of equations are undefined, so the answer cannot be determined for them.

**EXAMPLE**
>**Input**: equations = \[["a","b"]], values = [0.5], queries = \[["a","b"],["b","a"],["a","c"],["x","y"]]
**Output**: [0.50000,2.00000,-1.00000,-1.00000]

**[leetcode url](https://leetcode.com/problems/evaluate-division/description)**