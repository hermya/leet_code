<h2 style="color:#F90;">8. String to Integer (atoi)</h2>

Implement the `myAtoi(string s)` function, which converts a string to a 32-bit signed integer.

The algorithm for `myAtoi(string s)` is as follows:

1.  **Whitespace**: Ignore any leading whitespace (`" "`).
2.  **Signedness**: Determine the sign by checking if the next character is `'-'` or `'+'`, assuming positivity is neither present.
3.  **Conversion**: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
4.  **Rounding**: If the integer is out of the 32-bit signed integer range `[-231, 231 - 1]`, then round the integer to remain in the range. Specifically, integers less than `-231` should be rounded to `-231`, and integers greater than `231 - 1` should be rounded to `231 - 1`.

Return the integer as the final result.

**EXAMPLE 1**
>**Input**: s = " -042"
**Output**: -42
<p style="color:#007;">
<b>Explanation</b><br>
<pre>
Step 1: "   -042" (leading whitespace is read and ignored)
            ^
Step 2: "   -042" ('-' is read, so the result should be negative)
             ^
Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
</pre>
</p>

**EXAMPLE 2**
>**Input**: s = "1337c0d3"
**Output**: 1337
<p style="color:#007;">
<b>Explanation</b><br>
<pre>
Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
         ^
Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
             ^
</pre>
</p>

**[leetcode url](https://leetcode.com/problems/string-to-integer-atoi/description/)**