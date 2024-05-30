<h2 style="color:#0C9;">374. Guess Number Higher or Lower</h2>

We are playing the Guess Game. The game is as follows:

I pick a number from `1` to `n`. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API `int guess(int num)`, which returns three possible results:

* `-1`: Your guess is higher than the number I picked (i.e. `num > pick`).
* `1`: Your guess is lower than the number I picked (i.e. `num < pick`).
* `0`: your guess is equal to the number I picked (i.e. `num == pick`).

Return *the number that I picked*.

**EXAMPLE**
>**Input**: n = 10, pick = 6
**Output**: 6

<p style="color:#007;">
<b>Explanation</b><br>
You can place only one flower on this flowerbed at position 3, placing any other flower will violate the policy.
</p>

**[leetcode url](https://leetcode.com/problems/guess-number-higher-or-lower/description/)**
