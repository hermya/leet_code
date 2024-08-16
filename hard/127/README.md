<h2 style="color:#F00;">127. Word Ladder</h2>

A **transformation sequence** from word `beginWord` to word `endWord` using a dictionary `wordList` is a sequence of words `beginWord -> s1 -> s2 -> ... -> sk` such that:

-   Every adjacent pair of words differs by a single letter.
-   Every `si` for `1 <= i <= k` is in `wordList`. Note that `beginWord` does not need to be in `wordList`.
-   `sk == endWord`

Given two words, `beginWord` and `endWord`, and a dictionary `wordList`, return _the **number of words** in the **shortest transformation sequence** from_ `beginWord` _to_ `endWord`_, or_ `0` _if no such sequence exists._

**EXAMPLE**
>**Input**: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
**Output**: 5

<p style="color:#007;">
<b>Explanation</b><br>
One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.
</p>

**[leetcode url](https://leetcode.com/problems/word-ladder/description/)**