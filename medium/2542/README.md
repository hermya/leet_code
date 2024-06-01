<h2 style="color:#F90;">2542. Maximum Subsequence Score</h2>

You are given two **0-indexed** integer arrays `nums1` and `nums2` of equal length `n` and a positive integer `k`. You must choose a **subsequence** of indices from `nums1` of length `k`.

For chosen indices `i`~0~, `i`~1~, ..., `i`~k~ ~-~ ~1~, your **score** is defined as:

* The sum of the selected elements from `nums1` multiplied with the **minimum** of the selected elements from `nums2`.

* It can defined simply as: `(nums1[i0] + nums1[i1] +...+ nums1[ik - 1]) * min(nums2[i0] , nums2[i1], ... ,nums2[ik - 1])`. 

Return the **maximum** possible score.

A subsequence of indices of an array is a set that can be derived from the set `{0, 1, ..., n-1}` by deleting some or no elements.
**EXAMPLE**
>**Input**: nums1 = [1,3,3,2], nums2 = [2,1,3,4], k = 3
**Output**: 12

<p style="color:#007;">
<b>Explanation</b><br>
The four possible subsequence scores are:<br>
- We choose the indices 0, 1, and 2 with score = (1+3+3) * min(2,1,3) = 7.<br>
- We choose the indices 0, 1, and 3 with score = (1+3+2) * min(2,1,4) = 6.<br> 
- We choose the indices 0, 2, and 3 with score = (1+3+2) * min(2,3,4) = 12.<br>
- We choose the indices 1, 2, and 3 with score = (3+3+2) * min(1,3,4) = 8.<br>
Therefore, we return the max score, which is 12.<br>
</p>

**[leetcode url](https://leetcode.com/problems/maximum-subsequence-score/description)**