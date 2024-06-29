<h2 style="color:#F90;">150. Evaluate Reverse Polish Notation</h2>

You are given an array of strings `tokens` that represents an arithmetic expression in a [Reverse Polish Notation](http://en.wikipedia.org/wiki/Reverse_Polish_notation).

Evaluate the expression. Return _an integer that represents the value of the expression_.

**Note** that:

-   The valid operators are `'+'`, `'-'`, `'*'`, and `'/'`.
-   Each operand may be an integer or another expression.
-   The division between two integers always **truncates toward zero**.
-   There will not be any division by zero.
-   The input represents a valid arithmetic expression in a reverse polish notation.
-   The answer and all the intermediate calculations can be represented in a **32-bit** integer.

**EXAMPLE**
>**Input**: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
**Output**: 22

<p style="color:#007;">
<b>Explanation</b><br>
((10 * (6 / ((9 + 3) * -11))) + 17) + 5<br>
= ((10 * (6 / (12 * -11))) + 17) + 5<br>
= ((10 * (6 / -132)) + 17) + 5<br>
= ((10 * 0) + 17) + 5<br>
= (0 + 17) + 5<br>
= 17 + 5<br>
= 22
</p>

**[leetcode url](https://leetcode.com/problems/evaluate-reverse-polish-notation/description)**
