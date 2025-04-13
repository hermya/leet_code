<h2 style="color:#0C9;">3375. Minimum Operations to Make Array Values Equal to K</h2>

You are given an integer array `nums` and an integer `k`.

An integer `h` is called **valid** if all values in the array that are **strictly greater** than `h` are _identical_.

For example, if `nums = [10, 8, 10, 8]`, a **valid** integer is `h = 9` because all `nums[i] > 9` are equal to 10, but 5 is not a **valid** integer.

You are allowed to perform the following operation on `nums`:

-   Select an integer `h` that is _valid_ for the **current** values in `nums`.
-   For each index `i` where `nums[i] > h`, set `nums[i]` to `h`.

Return the **minimum** number of operations required to make every element in `nums` **equal** to `k`. If it is impossible to make all elements equal to `k`, return -1.

**EXAMPLE**
>**Input**: nums = [5,2,5,4,5], k = 2
**Output**: 2

<p style="color:#007;">
<b>Explanation</b><br>
The operations can be performed in order using valid integers 4 and then 2.
</p>

**[leetcode url](https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/description/)**
