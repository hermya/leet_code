<h2 style="color:#F90;">547. Number of Provinces</h2>

There are `n` cities. Some of them are connected, while some are not. If city `a` is connected directly with city `b`, and city `b` is connected directly with city `c`, then city `a` is connected indirectly with city `c`.

A **province** is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an `n x n` matrix `isConnected` where `isConnected[i][j] = 1` if the `i`^th^ city and the `j`^th^ city are directly connected, and `isConnected[i][j] = 0` otherwise.

Return *the total number of **provinces***.

**EXAMPLE**
<img src="https://assets.leetcode.com/uploads/2020/12/24/graph1.jpg"></img>
>**Input**: isConnected = \[[1,1,0],[1,1,0],[0,0,1]]
**Output**: 2

**[leetcode url](https://leetcode.com/problems/number-of-provinces/description)**