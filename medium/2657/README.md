<h2 style="color:#F90;">2657. Find the Prefix Common Array of Two Arrays</h2>

You are given two **0-indexed** integer permutations `A` and `B` of length `n`.

A **prefix common array** of `A` and `B` is an array `C` such that `C[i]` is equal to the count of numbers that are present at or before the index `i` in both `A` and `B`.

Return _the **prefix common array** of_ `A` _and_ `B`.

A sequence of `n` integers is called a **permutation** if it contains all integers from `1` to `n` exactly once.

**EXAMPLE**
>**Input**: A = [1,3,2,4], B = [3,1,2,4]
**Output**: [0,2,3,4]

<p style="color:#007;">
<b>Explanation</b><br>
<pre>
At i = 0: no number is common, so C[0] = 0.
At i = 1: 1 and 3 are common in A and B, so C[1] = 2.
At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
At i = 3: 1, 2, 3, and 4 are common in A and B, so C[3] = 4.
</pre>
</p>

**[leetcode url](https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description)**
