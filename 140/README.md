<h2 style="color:#F00;">140. Word Break II</h2>

Given a string `s` and a dictionary of strings `wordDict`, add spaces in `s` to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in **any** order.

**Note** that the same word in the dictionary may be reused multiple times in the segmentation.

**EXAMPLE**
>**Input**: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
**Output**: ["cats and dog","cat sand dog"]

<p style="color:#007;">
<b>Explanation</b><br>
Score  a=1, c=9, d=5, g=3, o=2<br>
Given letters, we can form the words "dad" (5+1+5) and "good" (3+2+2+5) with a score of 23.<br>
Words "dad" and "dog" only get a score of 21.
</p>

**[leetcode url](https://leetcode.com/problems/word-break-ii/description/)**
