<h2 style="color:#F90;">274. H-Index</h2>

Given an array of integers `citations` where `citations[i]` is the number of citations a researcher received for their `i`^th^ paper, return *the researcher's h-index*.

According to the <a href="https://en.wikipedia.org/wiki/H-index">definition of h-index on Wikipedia</a>: The h-index is defined as the maximum value of `h` such that the given researcher has published at least `h` papers that have each been cited at least `h` times.

**EXAMPLE**
>**Input**: citations = [3,0,6,1,5]
**Output**: 3

<p style="color:#007;">
<b>Explanation</b><br>
[3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.<br>
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
</p>

**[leetcode url](https://leetcode.com/problems/h-index/description)**