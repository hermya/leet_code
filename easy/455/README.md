<h2 style="color:#0C9;">455. Assign Cookies</h2>

Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

Each child `i` has a greed factor `g[i]`, which is the minimum size of a cookie that the child will be content with; and each cookie `j` has a size `s[j]`. If `s[j] >= g[i]`, we can assign the cookie `j` to the child `i`, and the child `i` will be content. Your goal is to maximize the number of your content children and output the maximum number.

**EXAMPLE**
>**Input**: g = [1,2,3], s = [1,1]
**Output**: 1

<p style="color:#007;">
<b>Explanation</b><br>
You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.<br>
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.
</p>

**[leetcode url](https://leetcode.com/problems/assign-cookies/description/)**
