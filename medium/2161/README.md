<h2 style="color:#F90;">2161. Partition Array According to Given Pivot</h2>
You are given a **0-indexed** integer array `nums` and an integer `pivot`. Rearrange `nums` such that the following conditions are satisfied:

-   Every element less than `pivot` appears **before** every element greater than `pivot`.
-   Every element equal to `pivot` appears **in between** the elements less than and greater than `pivot`.
-   The **relative order** of the elements less than `pivot` and the elements greater than `pivot` is maintained.
    -   More formally, consider every `pi`, `pj` where `pi` is the new position of the `ith` element and `pj` is the new position of the `jth` element. If `i < j` and **both** elements are smaller (_or larger_) than `pivot`, then `pi < pj`.

Return `nums` _after the rearrangement._

**EXAMPLE**
>**Input**: [9,12,5,10,14,3,10], pivot = 10
**Output**: [9,5,3,10,10,12,14]

<p style="color:#007;">
<b>Explanation</b><br>
<pre>
The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
</pre>
</p>

**[leetcode url](https://leetcode.com/problems/partition-array-according-to-given-pivot/description)**