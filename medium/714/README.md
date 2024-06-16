<h2 style="color:#F90;">714. Best Time to Buy and Sell Stock with Transaction Fee</h2>

You are given an array `prices` where `prices[i]` is the price of a given stock on the `i`^th^ day, and an integer `fee` representing a transaction fee.

Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction.

Note:

* You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
* The transaction fee is only charged once for each stock purchase and sale.

**EXAMPLE**
>**Input**: prices = [1,3,2,8,4,9], fee = 2
**Output**: 8
<p style="color:#007;">
<b>Explanation</b><br>
The maximum profit can be achieved by:<br>
- Buying at prices[0] = 1<br>
- Selling at prices[3] = 8<br>
- Buying at prices[4] = 4<br>
- Selling at prices[5] = 9<br>
The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.<br>
</p>

**[leetcode url](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description)**