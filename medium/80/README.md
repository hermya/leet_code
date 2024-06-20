<h2 style="color:#F90;">80. Remove Duplicates from Sorted Array II</h2>

Given an integer array `nums` sorted in **non-decreasing order**, remove some duplicates <b><a href="https://en.wikipedia.org/wiki/In-place_algorithm">in-place</a></b> such that each unique element appears **at most twice**. The **relative order** of the elements should be kept the **same**.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the **first part** of the array `nums`. More formally, if there are `k` elements after removing the duplicates, then the first `k` elements of `nums` should hold the final result. It does not matter what you leave beyond the first `k` elements.

Return `k` *after placing the final result in the first* `k` *slots of* `nums`.

Do **not** allocate extra space for another array. You must do this by **modifying the input array** in-place with O(1) extra memory.

**Custom Judge:**

The judge will test your solution with the following code:

```java
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```
If all assertions pass, then your solution will be **accepted.**

**EXAMPLE**
>**Input**: nums = [0,0,1,1,1,1,2,3,3]
**Output**: 7, nums = [0,0,1,1,2,3,3,\_,\_]

<p style="color:#007;">
<b>Explanation</b><br>
Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.<br>
It does not matter what you leave beyond the returned k (hence they are underscores).
</p>

**[leetcode url](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description)**
