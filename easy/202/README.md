<h2 style="color:#0C9;">202. Happy Number</h2>

Write an algorithm to determine if a number `n` is happy.

A **happy number** is a number defined by the following process:

-   Starting with any positive integer, replace the number by the sum of the squares of its digits.
-   Repeat the process until the number equals 1 (where it will stay), or it **loops endlessly in a cycle** which does not include 1.
-   Those numbers for which this process **ends in 1** are happy.

Return `true` _if_ `n` _is a happy number, and_ `false` _if not_.

**EXAMPLE**
>**Input**: n = 19
**Output**: true

<p style="color:#007;">
<b>Explanation</b><br>
1<sup>2</sup> + 9<sup>2</sup> = 82<br>
8<sup>2</sup> + 2<sup>2</sup> = 68<br>
6<sup>2</sup> + 8<sup>2</sup> = 100<br>
1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1
</p>

**[leetcode url](https://leetcode.com/problems/happy-number/description/)**
