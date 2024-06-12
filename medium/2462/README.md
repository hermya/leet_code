<h2 style="color:#F90;">2462. Total Cost to Hire K Workers</h2>

You are given a 0-indexed integer array `costs` where `costs[i]` is the cost of hiring the `i`^th^ worker.

You are also given two integers `k` and `candidates`. We want to hire exactly `k` workers according to the following rules:

* You will run `k` sessions and hire exactly one worker in each session.
* In each hiring session, choose the worker with the lowest cost from either the first `candidates` workers or the last `candidates` workers. Break the tie by the smallest index.
    * For example, if `costs = [3,2,7,7,1,2]` and `candidates = 2`, then in the first hiring session, we will choose the `4`^th^ worker because they have the lowest cost [<u>3</u>,<u>2</u>,7,7,<u>1</u>,<u>2</u>].
    * In the second hiring session, we will choose `1`^st^ worker because they have the same lowest cost as `4`^th^ worker but they have the smallest index [<u>3</u>,<u>2</u>,7,<u>7</u>,<u>2</u>]. Please note that the indexing may be changed in the process.
* If there are fewer than candidates workers remaining, choose the worker with the lowest cost among them. Break the tie by the smallest index.
* A worker can only be chosen once.

Return *the total cost to hire exactly* `k` *workers*.

**EXAMPLE**
>**Input**: costs = [17,12,10,2,7,2,11,20,8], k = 3, candidates = 4
**Output**: 11

<p style="color:#007;">
<b>Explanation</b><br>
We hire 3 workers in total. The total cost is initially 0.<br>
- In the first hiring round we choose the worker from [<u>17,12,10,2</u>,7,<u>2,11,20,8</u>]. The lowest cost is 2, and we break the tie by the smallest index, which is 3. The total cost = 0 + 2 = 2.<br>
- In the second hiring round we choose the worker from [<u>17,12,10,2</u>,<u>2,11,20,8</u>]. The lowest cost is 2 (index 4). The total cost = 2 + 2 = 4.<br>
- In the third hiring round we choose the worker from [<u>17,12,10,7,11,20,8</u>]. The lowest cost is 7 (index 3). The total cost = 4 + 7 = 11. Notice that the worker with index 3 was common in the first and last four workers.<br>
The total hiring cost is 11.<br>
</p>

**[leetcode url](https://leetcode.com/problems/total-cost-to-hire-k-workers/description)**