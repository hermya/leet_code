class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        var l1 = text1.length();
        var l2 = text2.length();
        var t1 = text1.toCharArray();
        var t2 = text2.toCharArray();
        var ans = new int[l1 + 1][l2 + 1];
        var uMax = 0;
        var lMax = 0;
        var cMax = 0;
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                cMax = ans[i-1][j-1];
                uMax = ans[i - 1][j];
                lMax = ans[i][j - 1];
                if (t1[i - 1] == t2[j - 1]) {
                    ans[i][j] = cMax + 1;
                } else {
                    ans[i][j] = Math.max(uMax, lMax);
                }
            }
        }
        return ans[l1][l2];
    }
}