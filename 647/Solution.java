import java.util.Objects;

class Solution {
    public int countSubstrings(String s) {
        var pc = 0;
        for (int x = 0; x < s.length(); x++) {
            // even palindrome
            for (int i = x, j = x - 1; i < s.length() && j >= 0; i++, j--) {
                if (Objects.equals(s.charAt(i), s.charAt(j))) {
                    pc++;
                } else {
                    break;
                }
            }
            // odd palindrome
            for (int i = x, j = x; i < s.length() && j >= 0; i++, j--) {
                if (Objects.equals(s.charAt(i), s.charAt(j))) {
                    pc++;
                } else {
                    break;
                }
            }
        }
        return pc;
    }
}
