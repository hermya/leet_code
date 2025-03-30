<h2 style="color:#F90;">763. Partition Labels</h2>

You are given a string `s`. We want to partition the string into as many parts as possible so that each letter appears in at most one part. For example, the string `"ababcc"` can be partitioned into `["abab", "cc"]`, but partitions such as `["aba", "bcc"]` or `["ab", "ab", "cc"]` are invalid.

Note that the partition is done so that after concatenating all the parts in order, the resultant string should be `s`.

Return _a list of integers representing the size of these parts_.

**EXAMPLE**
>**Input**: s = "ababcbacadefegdehijhklij"
**Output**: [9,7,8]

<p style="color:#007;">
<b>Explanation</b><br>
<pre>
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
</pre>
</p>

**[leetcode url](https://leetcode.com/problems/partition-labels/description/)**
