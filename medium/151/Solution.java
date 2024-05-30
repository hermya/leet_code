import java.util.ArrayList;

class Solution {
    public String reverseWords(String s) {
        var words = s.split(" ");
        var ans = new ArrayList<String>();
        int i = 0, j = words.length - 1;
        while (i <= j) {
            var word = words[j].trim();
            if (!word.equals(" ") && word.length() > 0) {
                ans.add(word);
            }
            j--;
        }
        return String.join(" ", ans);
    }
}