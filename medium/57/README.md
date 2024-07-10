<h2 style="color:#F90;">57. Insert Interval</h2>
You are given an array of non-overlapping intervals `intervals` where `intervals[i] = [starti, endi]` represent the start and the end of the `ith` interval and `intervals` is sorted in ascending order by `starti`. You are also given an interval `newInterval = [start, end]` that represents the start and end of another interval.

Insert `newInterval` into `intervals` such that `intervals` is still sorted in ascending order by `starti` and `intervals` still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return `intervals` _after the insertion_.

**Note** that you don't need to modify `intervals` in-place. You can make a new array and return it.

**EXAMPLE**
>**Input**: intervals = \[[1,3],[6,9]], newInterval = [2,5]
**Output**: \[[1,5],[6,9]]

**[leetcode url](https://leetcode.com/problems/insert-interval/description)**
