<h2 style="color:#0C9;">2784. Check if Array is Good</h2>

You are given an integer array `nums`. We consider an array **good** if it is a permutation of an array `base[n]`.

`base[n] = [1, 2, ..., n - 1, n, n]` (in other words, it is an array of length `n + 1` which contains `1` to `n - 1` exactly once, plus two occurrences of `n`). For example, `base[1] = [1, 1]` and `base[3] = [1, 2, 3, 3]`.

Return `true` *if the given array is good, otherwise return* `false`.

*Note*: A permutation of integers represents an arrangement of these numbers.

**EXAMPLE**
>**Input**: nums = [2, 1, 3]
**Output**: false

<p style="color:#007;">
<b>Explanation</b><br>
Since the maximum element of the array is 3, the only candidate n for which this array could be a permutation of base[n], is n = 3. However, base[3] has four elements but array nums has three. Therefore, it can not be a permutation of base[3] = [1, 2, 3, 3]. So the answer is false
</p>

**[leetcode url](https://leetcode.com/problems/check-if-array-is-good/description/)**
