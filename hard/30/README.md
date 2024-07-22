<h2 style="color:#F00;">30. Substring with Concatenation of All Words</h2>

You are given a string `s` and an array of strings `words`. All the strings of `words` are of **the same length**.

A **concatenated string** is a string that exactly contains all the strings of any permutation of `words` concatenated.

-   For example, if `words = ["ab","cd","ef"]`, then `"abcdef"`, `"abefcd"`, `"cdabef"`, `"cdefab"`, `"efabcd"`, and `"efcdab"` are all concatenated strings. `"acdbef"` is not a concatenated string because it is not the concatenation of any permutation of `words`.

Return an array of _the starting indices_ of all the concatenated substrings in `s`. You can return the answer in **any order**.

**EXAMPLE**
>**Input**: "barfoothefoobarman", words = ["foo","bar"]
**Output**: [0,9]

<p style="color:#007;">
<b>Explanation</b><br>
The substring starting at 0 is `"barfoo"`. It is the concatenation of `["bar","foo"]` which is a permutation of `words`.  <br>
The substring starting at 9 is `"foobar"`. It is the concatenation of `["foo","bar"]` which is a permutation of `words`.
</p>


**[leetcode url](https://leetcode.com/problems/substring-with-concatenation-of-all-words/description)**