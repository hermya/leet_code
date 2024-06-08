import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        var ans = new ArrayList<String>();
        if (digits.length() > 0) {
            tryCombinations(digits.toCharArray(), 0, new char[digits.length()], ans);
        }
        return ans;
    }

    void tryCombinations(char[] num, int pos, char[] currentAns, List<String> finalAns) {
        if (pos == num.length) {
            finalAns.add(String.valueOf(currentAns));
            return;
        }
        var cur = num[pos];
        for (char x : numToChar(cur)) {
            currentAns[pos] = x;
            tryCombinations(num, pos + 1, currentAns, finalAns);
        }
    }

    char[] numToChar(char num) {
        switch (num) {
            case '2': return new char[]{'a', 'b', 'c'};
            case '3': return new char[]{'d', 'e', 'f'};
            case '4': return new char[]{'g', 'h', 'i'};
            case '5': return new char[]{'j', 'k', 'l'};
            case '6': return new char[]{'m', 'n', 'o'};
            case '7': return new char[]{'p', 'q', 'r', 's'};
            case '8': return new char[]{'t', 'u', 'v'};
            case '9': return new char[]{'w', 'x', 'y', 'z'};
            default : return new char[]{};
        }
    }
}