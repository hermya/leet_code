import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        var charArray = s.toCharArray();
        var dict = new HashSet<String>(wordDict);
        var finalAns = new ArrayList<String>();
        findSentences(charArray, finalAns, 0, dict, "");
        return finalAns;
    }

    void findSentences(char[] charArray, List<String> finalAns, int startPos, Set<String> dict, String temp) {
        if (startPos == charArray.length) {
            finalAns.add(temp.trim());
            return;
        }
        var word = "";
        for (int i = startPos; i < charArray.length; i++) {
            word+= charArray[i];
            if (dict.contains(word)) {
                findSentences(charArray, finalAns, i+1, dict, temp + " " + word);
            }
        }
    }
}