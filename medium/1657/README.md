<h2 style="color:#F90;">1657. Determine if Two Strings Are Close</h2>

Two strings are considered **close** if you can attain one from the other using the following operations:

* Operation 1: Swap any two **existing** characters.
    *   For example, `abcde` -> `aecdb`
* Operation 2: Transform **every** occurrence of one **existing** character into another **existing** character, and do the same with the other character.
    * For example, `aacabb` -> `bbcbaa` (all `a`'s turn into `b`'s, and all `b`'s turn into `a`'s)

You can use the operations on either string as many times as necessary.

Given two strings, `word1` and `word2`, return `true` *if* `word1` *and* `word2` *are **close**, and* `false` *otherwise*.

**EXAMPLE**
>**Input**: word1 = "abc", word2 = "bca"
**Output**: true
<p style="color:#007;">
<b>Explanation</b><br>
You can attain word2 from word1 in 2 operations.<br>
Apply Operation 1: "abc" -> "acb"<br>
Apply Operation 1: "acb" -> "bca"<br>
</p>

**[leetcode url](https://leetcode.com/problems/determine-if-two-strings-are-close/description)**