<h2 style="color:#F90;">3144. Minimum Substring Partition of Equal Character Frequency</h2>

Given a string `s`, you need to partition it into one or more balanced 
substrings
. For example, if `s == "ababcc"` then `("abab", "c", "c")`, `("ab", "abc", "c")`, and `("ababcc")` are all valid partitions, but `("a",`**`"bab"`**`,"cc")`, `(`**`"aba"`**`,"bc", "c")`, and `("ab",`**`"abcc"`**`)` are not. The unbalanced substrings are bolded.

Return the **minimum** number of substrings that you can partition `s` into.

**Note**: A **balanced** string is a string where each character in the string occurs the same number of times.

**EXAMPLE**
>**Input**: s = "fabccddg"
**Output**: 3

<p style="color:#007;">
<b>Explanation</b><br>
We can partition the string s into 3 substrings in one of the following ways: `("fab, "ccdd", "g")`, or `("fabc", "cd", "dg")`.
</p>

**[leetcode url](https://leetcode.com/problems/minimum-substring-partition-of-equal-character-frequency/description/)**