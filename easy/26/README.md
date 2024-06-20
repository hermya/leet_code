<h2 style="color:#0C9;">27. Remove Element</h2>

Given an integer array `nums` sorted in **non-decreasing** order, remove the duplicates <b><a href="https://en.wikipedia.org/wiki/In-place_algorithm">in-place</a></b> such that each unique element appears only **once**. The **relative order** of the elements should be kept the **same**. Then return *the number of unique elements in* `nums`.

Consider the number of unique elements of `nums` to be `k`, to get accepted, you need to do the following things:

* Change the array `nums` such that the first `k` elements of `nums` contain the unique elements in the order they were present in `nums` initially. The remaining elements of `nums` are not important as well as the size of `nums`.
* Return `k`.

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
>**Input**: nums = [0,0,1,1,1,2,2,3,3,4]
**Output**: 5, nums = [0,1,2,3,4,\_,\_,\_,\_,\_]

<p style="color:#007;">
<b>Explanation</b><br>
Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.<br>
It does not matter what you leave beyond the returned k (hence they are underscores).
</p>

**[leetcode url](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description)**
