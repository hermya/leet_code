class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        var s1arr = s1.toCharArray();
        var s2arr = s2.toCharArray();
        var s3arr = s3.toCharArray();

        if (s1arr.length + s2arr.length != s3arr.length) {
            return false;
        }
        if (s1arr.length == 0) {
            return s2.equals(s3);
        }
        if (s2arr.length == 0) {
            return s1.equals(s3);
        }

        var dp = new boolean[s1arr.length + 1][s2arr.length + 1];
        dp[s1arr.length][s2arr.length] = true;

        for (int i = s1arr.length; i >= 0; i--) {
            for (int j = s2arr.length; j >= 0; j--) {
                if (i < s1arr.length) {
                    dp[i][j] = dp[i][j] || (s1arr[i] == s3arr[i + j] && dp[i + 1][j]);
                }
                if (j < s2arr.length) {
                    dp[i][j] = dp[i][j] || (s2arr[j] == s3arr[i + j] && dp[i][j + 1]);
                }
            }
        }

        return dp[0][0];
    }
}