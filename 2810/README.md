## 2810. Faulty Keyboard

Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.

You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.

Return the final string that will be present on your laptop screen.

**EXAMPLE**
>**Input**: s = "string"
>**Output**: "rtsng"

<p style="color:#007;">
<b>Explanation</b><br>
After typing first character, the text on the screen is "s".<br>
After the second character, the text is "st". <br>
After the third character, the text is "str".<br>
Since the fourth character is an 'i', the text gets reversed and becomes "rts".<br>
After the fifth character, the text is "rtsn". <br>
After the sixth character, the text is "rtsng". <br>
Therefore, we return "rtsng".<br>
</p>

**[leetcode url](https://leetcode.com/problems/faulty-keyboard/description/)**
