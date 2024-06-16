<h2 style="color:#F90;">1268. Search Suggestions System</h2>

You are given an array of strings `products` and a string `searchWord`.

Design a system that suggests at most three product names from `products` after each character of `searchWord` is typed. Suggested products should have common prefix with `searchWord`. If there are more than three products with a common prefix return the three lexicographically minimums products.

Return *a list of lists of the suggested products after each character of* `searchWord` *is typed*.

**EXAMPLE**
>**Input**
products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
**Output**
\[["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]]
<p style="color:#007;">
<b>Explanation</b><br>
Products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"].<br>
After typing m and mo all products match and we show user ["mobile","moneypot","monitor"].<br>
After typing mou, mous and mouse the system suggests ["mouse","mousepad"].<br>
</p>

**[leetcode url](https://leetcode.com/problems/search-suggestions-system/description)**