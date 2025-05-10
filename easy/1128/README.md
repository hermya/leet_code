<h2 style="color:#0C9;">1128. Number of Equivalent Domino Pairs</h2>

Given a list of `dominoes`, `dominoes[i] = [a, b]` is **equivalent to** `dominoes[j] = [c, d]` if and only if either (`a == c` and `b == d`), or (`a == d` and `b == c`) - that is, one domino can be rotated to be equal to another domino.

Return _the number of pairs_ `(i, j)` _for which_ `0 <= i < j < dominoes.length`_, and_ `dominoes[i]` _is **equivalent to**_ `dominoes[j]`.

**EXAMPLE**
>**Input**: dominoes = \[[1,2],[1,2],[1,1],[1,2],[2,2]]
**Output**: 3

**[leetcode url](https://leetcode.com/problems/number-of-equivalent-domino-pairs/description/)**
