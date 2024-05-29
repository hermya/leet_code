<h2 style="color:#0C9;">2215. Find the Difference of Two Arrays</h2>

Given two `0-indexed` integer arrays `nums1` and `nums2`, *return a list* `answer` *of size* `2` *where*:

* `answer[0]` *is a list of all* **distinct** *integers in* `nums1` *which are* **not** *present in* `nums2`.
* `answer[1]` *is a list of all* **distinct** *integers in* `nums2` *which are* **not** *present in* `nums1`.
**Note** that the integers in the lists may be returned in **any** order.

**EXAMPLE**
>**Input**: nums1 = [1,2,3], nums2 = [2,4,6]
**Output**: \[[1,3],[4,6]]

<p style="color:#007;">
<b>Explanation</b><br>
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].<br>
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
</p>

**[leetcode url](https://leetcode.com/problems/find-the-difference-of-two-arrays/description)**
