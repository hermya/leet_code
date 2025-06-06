<h2 style="color:#F90;">3335. Total Characters in String After Transformations I</h2>

You are given a string `s` and an integer `t`, representing the number of **transformations** to perform. In one **transformation**, every character in `s` is replaced according to the following rules:

-   If the character is `'z'`, replace it with the string `"ab"`.
-   Otherwise, replace it with the **next** character in the alphabet. For example, `'a'` is replaced with `'b'`, `'b'` is replaced with `'c'`, and so on.

Return the **length** of the resulting string after **exactly** `t` transformations.

Since the answer may be very large, return it **modulo** `10^9 + 7`.

**EXAMPLE 1**
>**Input**: s = "abcyy", t = 2
**Output**: 7
<p style="color:#007;">
<b>Explanation</b>
<pre>
First Transformation (t = 1):
'a' becomes 'b'
'b' becomes 'c'
'c' becomes 'd'
'y' becomes 'z'
'y' becomes 'z'
String after the first transformation: "bcdzz"
Second Transformation (t = 2):
'b' becomes 'c'
'c' becomes 'd'
'd' becomes 'e'
'z' becomes "ab"
'z' becomes "ab"
String after the second transformation: "cdeabab"
Final Length of the string: The string is "cdeabab", which has 7 characters.
</pre>
</p>

**[leetcode url](https://leetcode.com/problems/total-characters-in-string-after-transformations-i/description/)**