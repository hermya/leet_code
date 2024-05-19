<h2 style="color:#F90;">786. K-th Smallest Prime Fraction</h2>

You are given a sorted integer array `arr` containing `1` and prime numbers, where all the integers of `arr` are unique. You are also given an integer `k`.

For every `i` and `j` where `0 <= i < j < arr.length`, we consider the fraction `arr[i] / arr[j]`.

Return the `k`^th^ smallest fraction considered. Return your answer as an array of integers of size `2`, where `answer[0] == arr[i]` and `answer[1] == arr[j]`.

**EXAMPLE**
>**Input**: arr = [1,2,3,5], k = 3
**Output**: [2,5]

<p style="color:#007;">
<b>Explanation:</b><br>
The fractions to be considered in sorted order are:<br>
1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.<br>
The third fraction is 2/5.<br>
</p>

**[leetcode url](https://leetcode.com/problems/k-th-smallest-prime-fraction/description/)**
