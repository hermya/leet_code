<h2 style="color:#0C9;">228. Summary Ranges</h2>

You are given a **sorted unique** integer array `nums`.

A **range** `[a,b]` is the set of all integers from `a` to `b` (inclusive).

Return _the **smallest sorted** list of ranges that **cover all the numbers in the array exactly**_. That is, each element of `nums` is covered by exactly one of the ranges, and there is no integer `x` such that `x` is in one of the ranges but not in `nums`.

Each range `[a,b]` in the list should be output as:

-   `"a->b"` if `a != b`
-   `"a"` if `a == b`

**EXAMPLE**
>**Input**: nums = [0,1,2,4,5,7]
**Output**: ["0->2","4->5","7"]

<p style="color:#007;">
<b>Explanation</b><br>
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
</p>

**[leetcode url](https://leetcode.com/problems/summary-ranges/description/)**
