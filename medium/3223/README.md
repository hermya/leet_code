<h2 style="color:#F90;">3223. Minimum Length of String After Operations</h2>

You are given a string `s`.

You can perform the following process on `s` **any** number of times:

-   Choose an index `i` in the string such that there is **at least** one character to the left of index `i` that is equal to `s[i]`, and **at least** one character to the right that is also equal to `s[i]`.
-   Delete the **closest** character to the **left** of index `i` that is equal to `s[i]`.
-   Delete the **closest** character to the **right** of index `i` that is equal to `s[i]`.

Return the **minimum** length of the final string `s` that you can achieve.

**EXAMPLE**
>**Input**: s = "abaacbcbb"
**Output**: [1,2,2,3]
<p style="color:#007;">
<b>Explanation</b><br>
We do the following operations:
<ul>
<li>Choose index 2, then remove the characters at indices 0 and 3. The resulting string is s = "bacbcbb".
</li>
<li>Choose index 3, then remove the characters at indices 0 and 5. The resulting string is s = "acbcb".
</li>
</ul>
</p>

**[leetcode url](https://leetcode.com/problems/minimum-length-of-string-after-operations/description)**