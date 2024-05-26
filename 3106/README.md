<h2 style="color:#F90;">3106. Lexicographically Smallest String After Operations With Constraint</h2>

You are given a string `s` and an integer `k`.

Define a function `distance(s1, s2)` between two strings `s1` and `s2` of the same length `n` as:

* The sum of the **minimum distance** between `s1[i]` and `s2[i]` when the characters from `'a'` to `'z'` are placed in a **cyclic** order, for all `i` in the range `[0, n - 1]`.
For example, `distance("ab", "cd") == 4`, and `distance("a", "z") == 1`.

You can **change** any letter of `s` to **any** other lowercase English letter, **any** number of times.

Return a string denoting the **[lexicographically smallest](## "A string a is lexicographically smaller than a string b if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b. If the first min(a.length, b.length) characters do not differ, then the shorter string is the lexicographically smaller one.")** string `t` you can get after some changes, such that `distance(s, t) <= k`.
**EXAMPLE**
> **Input**: s = "zbbz", k = 3
**Output**: "aaaz"

<p style="color:#007;">
<b>EXPLANATION</b><br>
Change s to "aaaz". The distance between "zbbz" and "aaaz" is equal to k = 3.
</p>

**[leetcode url](https://leetcode.com/problems/lexicographically-smallest-string-after-operations-with-constraint/description/)**
