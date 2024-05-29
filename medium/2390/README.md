<h2 style="color:#F90;">2390. Removing Stars From a String</h2>

You are given a string `s`, which contains stars `*`.

In one operation, you can:

Choose a star in `s`.
* Remove the closest **non-star** character to its **left**, as well as remove the star itself.
* *Return the string after **all** stars have been removed*.

Note:

* The input will be generated such that the operation is always possible.
* It can be shown that the resulting string will always be unique.

**EXAMPLE**
>**Input**: s = "leet**cod*e"
**Output**: "lecoe"
<p style="color:#007;">
<b>Explanation</b><br>
- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".<br>
- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".<br>
- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".<br>
There are no more stars, so we return "lecoe".
</p>

**[leetcode url](https://leetcode.com/problems/removing-stars-from-a-string/description/)**