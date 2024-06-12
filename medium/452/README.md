<h2 style="color:#F90;">452. Minimum Number of Arrows to Burst Balloons</h2>

There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array `points` where `points[i] = [xstart, xend]` denotes a balloon whose **horizontal diameter** stretches between `x`~start~ and `x`~end~. You do not know the exact y-coordinates of the balloons.

Arrows can be shot up **directly vertically** (in the positive y-direction) from different points along the x-axis. A balloon with `x`~start~ and `x`~end~ is burst by an arrow shot at `x` if `xstart <= x <= xend`. There is **no limit** to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.

Given the array `points`, return *the **minimum** number of arrows that must be shot to burst all balloons*.


**EXAMPLE**

>**Input**: points = \[[10,16],[2,8],[1,6],[7,12]]
**Output**: 2

<p style="color:#007;">
<b>Explanation</b><br>
The balloons can be burst by 2 arrows:<br>
- Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].<br>
- Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].<br>
</p>

**[leetcode url](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description)**