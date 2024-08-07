<h2 style="color:#F90;">97. Interleaving String</h2>

Given strings `s1`, `s2`, and `s3`, find whether `s3` is formed by an **interleaving** of `s1` and `s2`.

An **interleaving** of two strings `s` and `t` is a configuration where `s` and `t` are divided into `n` and `m`

substrings

respectively, such that:

-   `s = s1 + s2 + ... + sn`
-   `t = t1 + t2 + ... + tm`
-   `|n - m| <= 1`
-   The **interleaving** is `s1 + t1 + s2 + t2 + s3 + t3 + ...` or `t1 + s1 + t2 + s2 + t3 + s3 + ...`

**Note:** `a + b` is the concatenation of strings `a` and `b`.

**EXAMPLE**
![](https://assets.leetcode.com/uploads/2020/09/02/interleave.jpg)
>**Input**: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
**Output**: true

<p style="color:#007;">
<b>Explanation</b><br>
One way to obtain s3 is:<br>
Split s1 into s1 = "aa" + "bc" + "c", and s2 into s2 = "dbbc" + "a".<br>
Interleaving the two splits, we get "aa" + "dbbc" + "bc" + "a" + "c" = "aadbbcbcac".<br>
Since s3 can be obtained by interleaving s1 and s2, we return true.
</p>

**[leetcode url](https://leetcode.com/problems/interleaving-string/description)**
