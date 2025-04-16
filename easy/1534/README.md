<h2 style="color:#0C9;">1534. Count Good Triplets</h2>

Given an array of integers `arr`, and three integers `a`, `b` and `c`. You need to find the number of good triplets.

A triplet `(arr[i], arr[j], arr[k])` is **good** if the following conditions are true:

-   `0 <= i < j < k < arr.length`
-   `|arr[i] - arr[j]| <= a`
-   `|arr[j] - arr[k]| <= b`
-   `|arr[i] - arr[k]| <= c`

Where `|x|` denotes the absolute value of `x`.

Return _the number of good triplets_.

**EXAMPLE**
>**Input**: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
**Output**: 4

<p style="color:#007;">
<b>Explanation</b><br>
There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].
</p>

**[leetcode url](https://leetcode.com/problems/count-good-triplets/description/)**
