import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] charSet = new int[26];
        int[] count1Set = new int[26];
        int[] count2Set = new int[26];
        var len = word1.length();
        for (int i = 0; i < len; i++) {
            var x = word1.charAt(i);
            charSet[x - 'a'] = 1;
            count1Set[x - 'a']++;
        }

        for (int i = 0; i < len; i++) {
            var x = word2.charAt(i);
            if (charSet[x - 'a'] == 0) {
                return false;
            }    
            count2Set[x - 'a']++;
        }

        Arrays.sort(count1Set);
        Arrays.sort(count2Set);
        
        return Arrays.toString(count1Set).equals(Arrays.toString(count2Set));
    }
}