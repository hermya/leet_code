<h2 style="color:#F90;">1466. Reorder Routes to Make All Paths Lead to the City Zero</h2>

There are `n` cities numbered from `0` to `n - 1` and `n - 1` roads such that there is only one way to travel between two different cities (this network form a tree). Last year, The ministry of transport decided to orient the roads in one direction because they are too narrow.

Roads are represented by `connections` where `connections[i] = [a`~i~`, b`~i~`]` represents a road from city `a`~i~ to city `b`~i~.

This year, there will be a big event in the capital (city `0`), and many people want to travel to this city.

Your task consists of reorienting some roads such that each city can visit the city `0`. Return the **minimum** number of edges changed.

It's **guaranteed** that each city can reach city `0` after reorder.

**EXAMPLE**
<img src="https://assets.leetcode.com/uploads/2020/05/13/sample_1_1819.png"></img>
>**Input**: n = 6, connections = \[[0,1],[1,3],[2,3],[4,0],[4,5]]
**Output**: 3
<p style="color:#007;">
<b>Explanation</b><br>
Change the direction of edges show in red such that each node can reach the node 0 (capital).
</p>

**[leetcode url](https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/description)**