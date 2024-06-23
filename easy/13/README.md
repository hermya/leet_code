<h2 style="color:#0C9;">12. Integer to Roman</h2>

Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

<table>
<tr>
<td>Symbol</td><td>Value</td>
</tr>
<tr>
<td>I</td><td>1</td>
</tr>
<tr>
<td>V</td><td>5</td>
</tr>
<tr>
<td>X</td><td>10</td>
</tr>
<tr>
<td>L</td><td>50</td>
</tr>
<tr>
<td>C</td><td>100</td>
</tr>
<tr>
<td>D</td><td>500</td>
</tr>
<tr>
<td>M</td><td>1000</td>
</tr>
</table>

For example, `2` is written as `II` in Roman numeral, just two ones added together. `12` is written as `XII`, which is simply `X + II`. The number `27` is written as `XXVII`, which is `XX + V + II`.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not `IIII`. Instead, the number four is written as `IV`. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as `IX`. There are six instances where subtraction is used:

-   `I` can be placed before `V` (5) and `X` (10) to make 4 and 9. 
-   `X` can be placed before `L` (50) and `C` (100) to make 40 and 90. 
-   `C` can be placed before `D` (500) and `M` (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

**EXAMPLE**
>**Input**: s = "MCMXCIV"
**Output**: 1994
<p style="color:#007;">
<b>Explanation</b><br>
M = 1000, CM = 900, XC = 90 and IV = 4.
</p>

**[leetcode url](https://leetcode.com/problems/roman-to-integer/description)**