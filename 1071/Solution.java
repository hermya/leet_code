import java.util.ArrayList;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        var str1len = str1.length();
        var str2len = str2.length();
        var smallerWord = str1len > str2len ? str2 : str1;
        var largerWord = str1len > str2len ? str1 : str2;
        var lhs = new ArrayList<String>();
        lhs.add("");
        for (int i = 1; i <= smallerWord.length(); i++) {
            if (smallerWord.length() % i == 0 && largerWord.length() % i == 0) {
                var t = smallerWord.substring(0, i);
                if (isConcatenation(smallerWord, t) && isConcatenation(largerWord, t)) {
                    lhs.add(t);
                }
            }
        }
        return lhs.get(lhs.size() - 1);  
    }

    boolean isConcatenation(String s, String t) {
        var jump = t.length();
        var i = 0;
        while (i < s.length()) {
            if (!s.substring(i, jump).equals(t)){
                return false;
            } 
            i = jump;
            jump += t.length();
        }
        return true;
    }
}