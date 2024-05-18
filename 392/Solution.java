class Solution {
    public boolean isSubsequence(String s, String t) {
        var subSeqItr = 0;
        var subSeqSize = s.length();
        if (subSeqSize == 0) {
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(subSeqItr) == t.charAt(i)) {
                subSeqItr++;
            }
            if (subSeqItr == subSeqSize) {
                return true;
            }
        }
        return false;
    }
}