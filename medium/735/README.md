<h2 style="color:#F90;">735. Asteroid Collision</h2>

We are given an array `asteroids` of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

**EXAMPLE**
>**Input**: asteroids = [5,10,-5]
**Output**: [5,10]
<p style="color:#007;">
<b>Explanation</b><br>
The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
</p>

**[leetcode url](https://leetcode.com/problems/asteroid-collision/description/)**